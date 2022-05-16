package OOPSExamples;
abstract class Shape{
	 abstract void draw();
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
	}

}
