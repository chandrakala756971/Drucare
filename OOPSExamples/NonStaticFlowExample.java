package OOPSExamples;

public class NonStaticFlowExample {
int a=10;

NonStaticFlowExample(){
	System.out.println("default constructor");
}
NonStaticFlowExample(int a){
	this.a=a;
	System.out.println(a);
	System.out.println("constructor is executed");
}
{
	System.out.println("nonstatic bolck executed");
}
	public static void main(String[] args) {
		NonStaticFlowExample nsf2=new NonStaticFlowExample(10);
		
		NonStaticFlowExample nsf=new NonStaticFlowExample();
		System.out.println(nsf.a);
		System.out.println(nsf.b);
		NonStaticFlowExample nsf1=new NonStaticFlowExample();
		System.out.println(nsf1.a);
		System.out.println(nsf1.b);

	}
	int b;
	{    System.out.println(b);
	b=20;
	 System.out.println(b);
		System.out.println("again nonstatic block executed");
	}
}
//note:1.identify the non static data members from top to bottom
//2.execution of static blocks and assigning the values 
//3constructors can be executed atblast