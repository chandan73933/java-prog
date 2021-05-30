class stu
{
	int x;
	int y;
	void calculate(int a)
	{
		x=a;
	
	}
	void show()
	{
		System.out.println("a is"+a);
	}
	
	void  calculate(int a,int b)
	{
		x=a;
		y=b;
		
	}
	void show()
	{
		System.out.println("a is"+a);
		System.out.println(" b is "+b);
	}
	
}
class K
{
	public static void main (String[] args) {
		stu obj=new stu();
		obj.calculate(3);
		obj.calculate(3,4);
		obj.show();
	}	
}