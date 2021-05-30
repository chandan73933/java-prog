class A
{
	A()
	{
		System.out.println("cons with no arg");
	}
	A(int x,int y)
	{
		System.out.println("value are "+ x);
		
		System.out.println("value are "+ y);
	}
}
class cons
{
	public static void main(String[] args) {
		A obj=new A();
		A obj2=new A(3,6);
		
	}
}