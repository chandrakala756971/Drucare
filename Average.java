import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner scn=new Scanner(System.in);
System.out.println("enter five numbers:");
int a=scn.nextInt();
int b=scn.nextInt();
int c=scn.nextInt();
int d=scn.nextInt();
int e=scn.nextInt();
int average=(a+b+c+d+e)/2;
System.out.println("average"+average);
}
}

