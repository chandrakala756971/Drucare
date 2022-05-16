package OOPSExamples;

public class StaticFlowExample {
 static int i=10;
 //static int j=20;//1
 static {         //2
	main();
	 System.out.println(StaticFlowExample.i);
	 System.out.println("static block is executed");
 }
 public static void main(String[] args) {//3
	 main();
	 System.out.println(StaticFlowExample.j);
	System.out.println("main executed");
	}
public static void main() {//4
	
		System.out.println("static method executed");
	}
	static {//5
		main();
		System.out.println(StaticFlowExample.j);
		System.out.println("static block is executed");
		//main2();
	}
	static int j=20;
	//6
//static void main2() {
	//System.out.println(j);
//}
}
//Note:1.identify the static members from top to bottom
//2.assigning the variable values and declaration
//3.main class executed
