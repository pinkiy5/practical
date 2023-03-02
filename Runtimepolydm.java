package polymorphismexamples;

public class Runtimepolydm {
	public static void main(String[] args) {
		papa_mumma object;
		object = new children();
		System.out.println(object.Priority);  //if called variable like this than parent class variable called not child
	}

}
class papa_mumma{
	String Priority="high";
}
class children extends papa_mumma{
	String Priority="super high";
}