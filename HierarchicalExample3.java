package inheritancepac;
class Employee1{   //parent class
int salary = 40000;
void eSalary()
{
System.out.println("The Employee salary is :" +salary);
}}
class SeniorEmp extends Employee1{   //child 1 class
int hike = 3000;
void incrementSalary()
{
System.out.println("The senior Employee incremented salary is :" +(salary+(salary * hike)));
}}
class JuniorEmp extends Employee1{   //child 2 class
int hike = 1500;
void incrementSalary()
{
System.out.println("The junior Employee incremented salary is :" +(salary+(salary * hike)));
}}
class Intern extends Employee1{   //child 3 class
	int hike = 800;
	void incrementSalary() {
	System.out.println("The intern incremented salary is :" +(salary+(salary * hike)));
}}
public class HierarchicalExample3 {
	public static void main(String args[]){
		SeniorEmp s = new SeniorEmp();
		JuniorEmp j = new JuniorEmp();
		Intern i = new Intern();
		s.eSalary();
		s.incrementSalary();
		j.eSalary();
		j.incrementSalary();
		i.eSalary();
		i.incrementSalary();
		}

}
