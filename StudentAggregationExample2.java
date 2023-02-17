package inheritancepac;

public class StudentAggregationExample2 {  // class 1
	int id ;
	String name;
	Address address;  //aggregation (entity ref of address class
	public StudentAggregationExample2 ( int id, Address adress,String name) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
   public static void main(String[] args) {
	Address address1 = new Address("dgp","hhg","india");
	Address address2 = new Address("dytp","hlg","india");
	StudentAggregationExample2 s = new StudentAggregationExample2(12,address1,"pinki");
	StudentAggregationExample2 s2 = new StudentAggregationExample2(12,address2,"anudip");

}
}
