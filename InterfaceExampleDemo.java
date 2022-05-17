package OOPSExamples;
interface Animal{
	public void sleep();
	public void run();
}
interface Birds{
	public void sound();
	public void fly();
}
class Zoo implements Animal,Birds{
	public void sleep() {
	System.out.println("Some animals living in Zoo...");	
	}
	public void run() {
	System.out.println("all animals are running....");	
	}
	public void sound() {
		System.out.println("all birds making sounds....");
	}
	public void fly() {
		System.out.println("all birds flying....");
	}
}
public class InterfaceExampleDemo {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		zoo.sleep();
		zoo.run();
		zoo.sound();
		zoo.fly();
	}

}
