package stringexamples;

public class ImmutableTest {
	public static void main(String[] args) {
		String str="pinki";
		str.concat("yadav"); //insert string at end
		str=str.concat("yadav");//it print pinkiyadav
		System.out.println(str);  //it will print pinki only because str is immutable
	}

}
