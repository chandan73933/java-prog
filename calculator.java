import java.util.Scanner;
class calculator{
	public static void main(String ar[])
	{
		int a,b,c;
		int choice;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter two no");
		a=obj.nextInt();
		b=obj.nextInt();
		choice=obj.nextInt();
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for Substraction");
		System.out.println("enter 3 for Mult");
		System.out.println("enter 4 for Division");
		System.out.println("enter yuor choice");
		switch (choice)
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
			return;
		}
		System.out.println(" the output is "+c);
	}
}