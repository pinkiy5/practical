package stringexamples;
//divide string in n equal parts
public class DivideString {
public static void main(String[] args) {
	String s= "this is a string";
	int n=5;
	int part = s.length()/n;
	while(n != 0) {
		StringBuilder sb = new StringBuilder();
		if(n==1) {
			part=s.length();
		}
		for(int i=0;i<part;i++) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		s=s.substring(part);
		n--;
	}
}
}
