package thread;
// without wait() , notify(), notifyAll()
class Sync{
	int i;
	synchronized void display(int i) {
		this.i=i;
		System.out.println("data displayed: "+i);
	}
	synchronized int receive() {
		System.out.println("data received: "+i);
		return i;
	}
}
class Thread_First extends Thread{
	Sync obj;
	Thread_First(Sync obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.display(j);
		}
	}
}
class Thread_Second extends Thread{
	Sync obj;
	Thread_Second(Sync obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.receive();
		}
	}
}

public class InterThreadCommunicationEg2 {
public static void main(String[] args) {
	Sync obj = new Sync();
	Thread_First t = new Thread_First(obj);
	Thread_Second t1 = new Thread_Second(obj);
	t.start();
	t1.start();
}
}
