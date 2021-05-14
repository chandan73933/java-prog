import java.util.Scanner;
class test3
{
	public static void main(String ar[])
	{	
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=obj.nextInt();
		System.out.println("enter the value of a");
		int b=obj.nextInt();
		System.out.println("enter the value of a");
		int c=obj.nextInt();
		if(a>b)&&(b>c)
		{
			System.out.println("a is greater"+a);

		}
		else if(b>a)&&(b>c)
		{
			System.out.println("b is greate"+b);

		}
		else
		{
			System.out.println("c is greater"+c);
		}

		}
}