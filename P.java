class stu
{
	int x;
	int y;
	void calculate(int a)
	{
		x=a;
		System.out.println("a is"+x);
	
	}
	void  calculate(int a,int b)
	{
		x=a;
		y=b;
                System.out.println("a is"+x);
		System.out.println(" b is "+y);
		
	}
	
}
class P
{
	public static void main (String[] args) {
		stu obj=new stu();
		obj.calculate(3);
		obj.calculate(3,4);
		
	}	
}