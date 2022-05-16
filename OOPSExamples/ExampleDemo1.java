package OOPSExamples;
class Parent{
	void m1() {
		System.out.println("m1() method executed");
	}
	void m2() {
		System.out.println("m2() method executed");
	}
	
}
//class extending
class Child extends Parent{
	@Override
	void m2() {
		System.out.println("m3() method executed");
	}
}
class ExampleDemo1 {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		System.out.println(++a);
		Child c=new Child();
 c.m2();
  c.m1() ;     
	}

}
//1.If we make a class is final then that class can be overloaded.
//2.If we make a method is final then that cannot be overridden.
//3.If we  make a variable is a final that value cannot changed
