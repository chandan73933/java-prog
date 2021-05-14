import java.util.Scanner;
class test3
{
	public static void main(String ar[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no ");
		int a=obj.nextInt();
		System.out.println("entter the no");
		int b=obj.nextInt();
		int c=obj.nextInt();
		char ch=obj.nextchar();
		System.out.println("enter 1 for add");
		System.out.println("enter 1 for sub");
		System.out.println("enter 1 for mult");
		System.out.println("enter 1 for div");
		System.out.println("enter your choice");
		switch(ch)
		{
			case 1:
			c=a+b;
			break;
			case 2:
			c=a-b;
			break;
			case 3:
			c=a*b;
			break;
			case 4:
			c=a%b;
			break;
			default:
			System.out.println("enter the valid choice");
			System.out.println("the value is "+c);
			
		}



	}
}