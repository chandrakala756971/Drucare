package OOPSExamples;
//creating class
class Casio{
	
	//creating methods with same name with different arguments list
	public void add()
	{System.out.println("nothing");}
	
	public void add(int i,int j)
	{System.out.println(i+j);}
	
	public void add(int i,int j,int k)
	{System.out.println(i+j+k);}
	
	public void add(int i,int j,String k)
	{System.out.println(i+j+k);}
}

//Main class
public class MethodOverLoadingExample1 {
	public static void main(String[] args) {
		//object creation
		Casio c=new Casio();
		c.add();
		c.add(2,3);
		c.add(2,3,4);
		c.add(4,5,"chandu");
  }
}
