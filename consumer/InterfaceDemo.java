package consumer;
interface interfaceDemo1 {
	public int product(int n);
}
public class InterfaceDemo {
   

			public static void main(String[] args) {
				interfaceDemo1 i = n -> n * n;
				System.out.println(i.product(10));


	}

	}
