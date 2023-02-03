package Class;

public class JavaBatch {
	//defining fields(instance variable)
		int id;
		String Bname;
		public static void main(String[] args) {
			//create object
			JavaBatch jb= new JavaBatch();
			JavaBatch jb1= new JavaBatch();

			//print value
			jb.id=1;
			jb.Bname="C4119";
			jb1.id=2;
			jb1.Bname="C2119";
			System.out.println("id is:"+jb.id+" " +"batch name is:"+ jb.Bname);
			System.out.println("id is:"+jb1.id+" " +"batch name is:"+ jb1.Bname);

		}
}
