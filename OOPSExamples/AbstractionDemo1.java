package OOPSExamples;
//abstaract class contains abstract and non satic methods
abstract class Shape{
	//abstract method
	 abstract void draw();
	 void draw1() {
		 System.out.println("drawing");
	 }
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}

public class AbstractionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s=new Rectangle();
s.draw();
Shape s1=new Circle();
s1.draw();
	}

}
