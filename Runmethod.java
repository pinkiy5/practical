package thread;

public class Runmethod extends Thread{
	public void run() {
		System.out.println("thread activated");
	}
	public static void main(String[] args) {
		Runmethod r1 = new Runmethod();
		r1.run();
	}

}
