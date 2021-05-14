class stu
{
	int a,b;
	stu(int x,int y)
	{
	a=x;
	b=y;	
	}
	void disp()
	{
		System.out.println("the value is a"+a);
		System.out.println("the value is b"+b);
	}
}
class cons
{
	 public static void main(String[] args) {
		stu obj=new stu(3,5);
		obj.disp();
	}
}