package Pattern;

public class Fibbonacci {

	public static void main(String[] args) {
	
	
	int a=0;
	int b=1;
    int c;
    int sum=0;
for(int i=1;i<=20;i++) {
	System.out.println(+a);
	c=a+b;
	a=b;
	b=c;
    sum=sum+a;
    }
    
    System.out.print("sum:"+sum);
	}
	
}
