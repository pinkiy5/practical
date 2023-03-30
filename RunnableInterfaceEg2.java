package thread;
// thread (runnable obj, string name)
public class RunnableInterfaceEg2 implements Runnable{
	public void run() {
		System.out.println("thread running");
	}
	public static void main(String[] args) {
		//creating object of RunnableInterfaceEg2
		Runnable ri = new RunnableInterfaceEg2();
		//creating object of thread class using thread(runnable ref var,string name)
		Thread t = new Thread(ri,"pinki");
		t.start();
		String s = t.getName();
		System.out.println(s);
	}

}
