package thread;

class Sthred_Test {  //class 1
	synchronized void display(int num) {  //synchronized method
		for(int i =1;i<=5;i++) {
			System.out.println(num+1);
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}}}}

public class Synchronized_Eg2 {
	public static void main(String[] args) {
		final Sthred_Test obj = new Sthred_Test();  //created object
		
		//1st thread object t1
		Thread t1 = new Thread() {
			public void show() {
				obj.display(2);
			}
		};
		
		// 2nd object created
		Thread t2 = new Thread() {
			public void show() {
				obj.display(5);
			}
		};
		t1.start();
		t2.start();
	}

}
