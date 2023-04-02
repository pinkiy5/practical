package thread;
//with/without using synchronization
class MyThreadClass{
	void print(int num) { //without synchronized method
		// synchronized void print(int num){ //with synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}}}}
class Thread1 extends Thread{
	MyThreadClass Mt;
	
	Thread1(MyThreadClass Mt){
		this.Mt=Mt;
	}
	public void run() {
		Mt.print(5);   // 5*1  5*2 ....
	}
}
class Thread2 extends Thread{
	MyThreadClass Mt;
	
	Thread2(MyThreadClass Mt){
		this.Mt=Mt;
	}
	public void run() {
		Mt.print(50);  //50*1  50*2 ....
	}
}
public class WithoutSynchronization {
  public static void main(String[] args) {
	  MyThreadClass obj = new MyThreadClass();
	  Thread1 t1 = new Thread1(obj);
	  Thread2 t2 = new Thread2(obj);
	  t1.start();
	  t2.start();

}
}
