package OOPSExamples;
//creating class
class EmployeeDemo{
	
	//creating non static variables
	int id;
	String name;
	double salary;
	String city;
	
	//creating constructor
	public EmployeeDemo() {
		System.out.println("nothing");
	}
	public EmployeeDemo(int id,String name){
		id=id;
		name=name;
		System.out.println(id+" "+name);
	}
 
public EmployeeDemo(int id,String name,String mail,double salary ){
	id=id;
	name=name;
	salary=salary;
	System.out.println(id+" "+name+""+mail+" "+salary);
}
	
public EmployeeDemo(int id,String name,String mail,double salary,String city ){
	id=id;
	name=name;
	salary=salary;
	city=city;
	System.out.println(id+" "+name+""+mail+" "+salary+" "+city);
}
	
}

public class ConstructorOverloadineDemo {

	public static void main(String[] args) {
		//creating object
		EmployeeDemo e=new EmployeeDemo();

		EmployeeDemo e1=new EmployeeDemo(1,"abc");
		EmployeeDemo e2=new EmployeeDemo(1,"abc","abc@gmail.com",10000);
		EmployeeDemo e3=new EmployeeDemo(1,"abc","abc@gmail.com",10000,"hyderabad");

	}

}
