package OOPSExamples;

class Registration{
	//making variables as private
private	int id;
private	String Name;
private	String mail;
private	double contact;
//creating set method
public void setRegistration(int id,String Name,String mail,double contact) {
	this.id=id;
	this.Name=Name;
	this.mail=mail;
	this.contact=contact;
}
//creatig get method
public int getid(){
	//System.out.println(id);
	return id;
	}
public String getName(){
	return Name;
	}
public String  getmail(){
	return mail;
	}
public double getcontact(){
	return contact;
	}
}
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		//creating object
		Registration r=new Registration();
		//passing values into set method
		r.setRegistration(1, "alpha", "abc@gmail.com",123456789);
		r.setRegistration(5678,"beeta", "def@gmail.com", 987654321);
		//getting values
	System.out.println(r.getid());
	System.out.println(r.getName());
	System.out.println(r.getmail());
	System.out.println(r.getcontact());
	   }

}
