package thread;
//creating thread by extending thread class
public class ThreadExample extends Thread {
	public void run() {
		System.out.println("i am thread ...thread is running");
	}
	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start(); //move thread to active state
		t.setName("pinki");
		String s = t.getName();
		System.out.println(s);
	}
	

}
