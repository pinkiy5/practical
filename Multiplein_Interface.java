package interfaceexamples;
//multiple inheritance-- more than one parent class/interface
interface Employee{ //parent interface 1
	void salary();
}
interface Developer{  //parent interface 2
	void bonus();
}
class Trainer implements Employee,Developer{
	@Override
	public void bonus() {
		System.out.println("bonus will be 10% of salary");
	}
	@Override
	public void salary() {
		System.out.println("salary incremented");
	}
}
public class Multiplein_Interface {
	public static void main(String[] args) {
		Trainer object = new Trainer();
		object.bonus();
		object.salary();
	}

}
