package thread;

public class Sleep_methodEg extends Thread{
	public void run() {
		for(int i =0;i<=5;i++) { //012345   012345   012345
			try {
				Thread.sleep(1800);  //thread will sleep for 800 milli sc
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Sleep_methodEg t = new Sleep_methodEg();
		Sleep_methodEg t1 = new Sleep_methodEg();
		t.start();
		t1.start();
	}

}
