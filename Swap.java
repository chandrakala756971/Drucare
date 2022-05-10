import java.util.Scanner;
class Swap{
public static void main(String[] args){
Scanner scn=new Scanner(System.in);
System.out.println("enter a value:");
System.out.println("enter b value:");
int a=scn.nextInt();
int b=scn.nextInt();
int c=a;
a=b;
b=c;
System.out.println("after swapping ");
System.out.println("enter a value: "+a);
System.out.println("enter b value: "+b);
}
}