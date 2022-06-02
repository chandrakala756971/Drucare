package Pattern;

public class Program1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)//left part
			{
				System.out.print("*");
			}
			for(int j=n;j>=i;j--) {//spaces
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {//right part
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
	


