package OOPSExamples;
//Hierachical inheritance
//super class

class AnimalType
{	// non static method
	    public void run()          
		{System.out.println("running");}
	  
	    public void sleep() 
		{System.out.println("sleeping");}
}

//sub class1
class Cat extends AnimalType{
		 void meow() 
		 {System.out.println("meow meow"); }
}

//sub class2
class Dog extends AnimalType{
	    void bark() 
	    	{System.out.println("bow bow");}
}
		 
 //Driver class
 public class HierachicalInheritance {

	     public static void main(String[] args) {
	    	//creating objects for subb classes
	    	 Dog d=new Dog();
	    	 d.bark();
	    	 d.run();
	    	 d.sleep();
	    	 Cat c=new Cat();
	    	 c.meow();
	    	 c.run();
	    	 c.sleep();
	     }		
}


