package thread;
//if not extending thread class object not treated as thread object
// passing object of class which implement runnable so that class run() method
// execute but not start()
public class RunnableInterface implements Runnable{
public void run() {
	System.out.println("i am thread...thread is running");;
}
public static void main(String[] args) {
	RunnableInterface ri = new RunnableInterface();
	Thread t = new Thread(ri); //create thread class object explicitly
	t.start();
}

}
