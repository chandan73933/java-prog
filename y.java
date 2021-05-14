 import java.util.Scanner;
 class T
 {
 	int a,b,c,d,e;
 	void getdata(int x,int y)
 	{
 		a=x;
 		b=y;
 	}
 	void display()
 	{
 		System.out.println("the entered value of the a is:- "+a);
 		System.out.println("the entered value of b is :-"+b);
 	}
 }
 class R extends T
 {
 	void calculate ()
 	{
 		c=a*a*a;
 		d=a*b;
 		System.out.println("the total value is :- "+c);
 		System.out.println("the total value is :- "+d);

 	}
 }
 class E extends R
 {	
 
 

 }
 class y
 {
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("the age is ");
 		int age =sc.nextInt();
 		E sc=new E();
 		sc.getdata(3,5);
 		sc.display();
 		sc.calculate();	
 	}
 }