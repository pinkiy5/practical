package thread;

public class DaemonEg extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("i am daemon");
		} else {
			System.out.println(Thread.currentThread().getName());
			System.out.println("i am user");
		}
	}
	
public static void main(String[] args) {
	DaemonEg t = new DaemonEg();
	DaemonEg t1 = new DaemonEg();
	DaemonEg t2 = new DaemonEg();
	t.setDaemon(true);
	t2.setDaemon(true);
	t.start();
	t1.start();
	t2.start();
}
}
