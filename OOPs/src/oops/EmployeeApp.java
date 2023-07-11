package oops;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Employee(); it will show an unresolved error 
		//the constructor Employee() is undefined
		
		Employee e1 = new Employee(123,"Hima",100000);
		System.out.println(e1.ssn);
		System.out.println(e1.name);
 
	}

}
