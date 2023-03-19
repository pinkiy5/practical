package stringexamples;
import java.util.regex.*;
public class RegEx2 {
	public static void main(String[] args) {
		//1st way
		Pattern p = Pattern.compile("..s"); // .(dot) represent a single character
		Matcher m = p.matcher("khs");
		boolean b = m.matches();
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("kjs").matches();
		
		//3rd way
		boolean b3 = Pattern.matches("..s", "ks");
	}

}
