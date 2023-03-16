package arrayexamples;

public class CopyArray {
	public static void main(String[] args) {
		//declaring a source array
		char[]copyFrom= {'d','e','c','f','f','e','i','n'};
		//decaring a destination array
		char[]copyTo=new char[7];//new array
		System.arraycopy(copyFrom, 1, copyTo, 1, 5); //-ecffe-
		//print destination array
		System.out.println(String.valueOf(copyTo));
	}

}
