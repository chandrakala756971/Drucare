package OOPSExamples;
//creating superclass
class Parents1
{
	public void give() {
		System.out.println(" money ,gold ,property");
	}
	public void praposal() {
		System.out.println(" to do job");
	}
}
//creating sub class
class Child1 extends Parents1{
	@Override
//sub class is not satisfying with parent class properties
	public void praposal() {
		System.out.println(" interested in business");
	}	
}
public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		Parents1 p=new Parents1();//super class object
		p.give();
		p.praposal();
		Child1 c=new Child1();//sub class object
		c.praposal();
		//overriding
		Parents1 p1=new Child1();
		p1.give();
        p1.praposal();
	}
}
