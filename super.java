class A
{
	int a,b,c;
	void setdata(int x)
	{
		a=x;
	}
	void display()
	{
		System.out.println("value of x is "+a);
	}
}
class B
{
	void setdata(int x,int y,int z)
	{
		super.setdata(x);
		b=y;
		c=z;
	}
	void display()
	{
		super.display();
		{
			System.out.println("the value of A is "+a);
			System.out.println("the value of A is "+b);
			System.out.println("the value of A is "+c);

		}
	}
	class super
	{
		public static void main(String ar[])
		{
			B obj=new B();
			obj.setdata(3,5,7);
			obj.display();
		}
	}
}