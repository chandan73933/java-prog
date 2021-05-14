import java.util.Scanner;
class test{
Scanner obj=new Scanner(System.in);
int c;
int a=obj.nextInt();
int b=obj.nextInt();

void getdata()
{
System.out.println("enter the number a"+a);
	
	System.out.println("enter the number b"+b);	
}
void add()
{
	 c=a+b;
	System.out.println("the add is "+c);
}
}
class fun
{
	public static void main(String[] args) {
	test sc=new test();
	sc.getdata();
	sc.add();
}
}
