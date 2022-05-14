package OOPSExamples;
//Creating Super Class
   class Claculator{                     //Grand Father
    //creating a non static method
	   public int add(int a, int b){
	     return a+b;
		}
}
//creating sub class
      class AdvanceCalculator extends Claculator{   //Father
	//creating non static method
	     public int sub(int a,int b){
		 return a-b;
	}
}
//creating sub class
    class VeryAdvanceCalculator extends AdvanceCalculator{
	public int multi(int a,int b) {
		return a*b;
	}
}
    //Driver class
      public class InheritanceExample1 {

	    public static void main(String[] args) {
		//creating object for non static methods
		     VeryAdvanceCalculator vc=new VeryAdvanceCalculator();
		
		//calling methods by using reference variable
		      int result1=vc.multi(10,20);
		      int result2=vc.sub(30,20);
		      int result3=vc.multi(10,20);
		
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
	}
}
