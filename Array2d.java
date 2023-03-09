package arrayexamples;
//multidimensional array
public class Array2d {
	public static void main(String[] args) {
		//declaring & initializing 2d array
		int arr[][] = { {2,5,6},{4,6,8}};
		for(int i = 0; i<2 ;i++) { //for printing row
			for(int j = 0; j<3; j++) { //for printing column
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
