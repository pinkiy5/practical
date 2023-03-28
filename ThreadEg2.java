package thread;
//directly we use thread class without extend
//with & without set name we can name the thread
public class ThreadEg2 {
	public void run() {
		System.out.println("pinki");
	}
	
	public static void main(String[] args) {
		//creating an object of the thread class using the thread constructor
		Thread t = new Thread("pallabi");
		Thread t1 = new Thread();
		/*ThreadEg2 obj = new ThreadEg2();
		 obj.run();*/
		t.start();
		t1.start();
		t1.setName("anudip");
		System.out.println("thread 0: "+t.getName());
		System.out.println("thread 1: "+t1.getName());
	}

}
