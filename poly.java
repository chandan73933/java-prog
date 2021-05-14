class test
{
	int a,b,c;
	void calculate(int x,float y)
	{
		a=x;
		c=y;
		System.out.println("the square is "+(a*c));
	}
	void calculate(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("the sum is "+(a+b));
		System.out.println("the sum is "+(a*b));
		System.out.println("the sum is "+(a/b));
	}
}
class poly{
 public static void main(String[] args) {
		test obj=new test();
		obj.calculate(4,6.6);
		obj.calculate(4,6);
	}
}