package stringexamples;
import java.util.regex.Pattern;

//quantifiers
//x? - x occur once or  not at all
//x+ - x occur once or more than one
//x* - x occur zero or more time
//x{n} - x occur n times x{7} only 7 char
//x{n,} - x occur n or more time x{7,} only 7 char or more

public class Regex3 {
	public static void main(String[] args) {
		boolean b7 = Pattern.matches("[A-Za-z0-9]{8,}", "Anudip123ppp");
		System.out.println(b7);
		boolean b8 = Pattern.matches("[A-Za-z0-9+@+.]{8,}", "Pallabi.Anudip@2023");
		System.out.println(b8);
		boolean b9 = Pattern.matches("[0-9]{10}", "8941559879");
		System.out.println(b9);
		boolean b10 = Pattern.matches("[6789]{1}[0-9]{9}", "8941559879");
		System.out.println(b10);
		boolean b11 = Pattern.matches("[a-z0-9+_.-]*@[a-z]*+\\.[a-z]{3}", "pinki.yadav9379@gmail.com");
		System.out.println(b11);

//meta character
//  \d-[0-9]
//  \s-white space character
//  \w-[a-zA-Z0-9]
		boolean b12 = Pattern.matches("\\w{9}","Anudip123");
		System.out.println(b12);

		

	}

}
