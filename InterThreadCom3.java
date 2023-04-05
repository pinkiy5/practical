package thread;
//with wait() , notify(), notifyAll()
class Sync1{
	int i;
	boolean flag = false;
	synchronized void display(int i) {
		if(flag)
			try {
				wait();
			}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		this.i=i;
		flag=true;
		System.out.println("data displayed: "+i);
		notify();
	}
	synchronized int receive() {
		if(!flag)
			try {
				wait();
			}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		System.out.println("data received: "+i);
		flag=false;
		notify();
		return i;
	}
}
class Thread_First1 extends Thread{
	Sync1 obj;
	Thread_First1(Sync1 obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.display(j);
		}
	}
}
class Thread_Second1 extends Thread{
	Sync1 obj;
	Thread_Second1(Sync1 obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.receive();
		}
	}
}

public class InterThreadCom3 {
public static void main(String[] args) {
	Sync1 obj = new Sync1();
	Thread_First1 t = new Thread_First1(obj);
	Thread_Second1 t1 = new Thread_Second1(obj);
	t.start();
	t1.start();
}
}

