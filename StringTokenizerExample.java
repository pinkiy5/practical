package stringexamples;
import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void my() { //static method my()
    	StringTokenizer t =new StringTokenizer("anudip foundation skill and carrer development center"," ");
    	while(t.hasMoreTokens()) { //boolean method checks if there is more token available or not
    		System.out.println(t.nextToken(" ")); //string method return next token from string token
    		
    	}
    	StringTokenizer st = new StringTokenizer("i am pinki & staying in bhiwadi");
    	while(st.hasMoreTokens()) {
    		System.out.println(st.nextToken("&"));
    	}
    }
    public static void main(String[] args) {
		my();
	}
}
