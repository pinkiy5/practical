package thread;
import java.util.Scanner;
//implement inter thread communication by creating banking methods like deposit and withdraw
class Bank{
	int balance;
	synchronized void diposit(int amount) {
		balance += amount;
		System.out.println("deposit : "+amount);
		notify();
		}
		
	synchronized void withdraw(int amount1) throws InterruptedException{
		while (balance < amount1) {
			System.out.println("balance is insufficient "+balance+" "+"please deposit");
			wait();
		}
		balance -= amount1;
		System.out.println("remaining amount: "+balance);
	}
}


public class Assignment_InterThreadCom {
public static void main(String[] args)throws InterruptedException {
	Bank b = new Bank();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount to deposit: ");
    int r = sc.nextInt();
    Thread dipositThread = new Thread(()-> {
    	b.diposit(r);
    });
    
System.out.println("enter amount to withdraw: ");
int w = sc.nextInt();

Thread withdrawThread = new Thread(() -> {
	try {
		b.withdraw(w);
	} catch(InterruptedException e) {
		System.out.println(e);
	}
});
dipositThread.start();
Thread.sleep(500);
withdrawThread.start();
dipositThread.join();
withdrawThread.join();


}
}


