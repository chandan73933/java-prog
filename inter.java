class A
{
	int a;
	void getdata(int x)
	{
		a=x;
	}
	void  putno()
	{
		System.out.println("the value of a is "+a);
	}
}
class B extends A
{
	float c,d;
	void getmarks(float y,float z)
	{
		c=y;
		d=z;
	}
	void putmr()
	{
		System.out.println("the value of c is "+c);
		System.out.println("the value of d is "+d);
	}

}
interface sports
{
	float sportwt=6.0f;
	void putwt();
}
class C extends B implements sports
{
	float total;
	public void putwt()
	{
		System.out.println("sports wt="+sportwt);
	}
	void display()
	{
		total=c+d+sportwt;
		putno();
		putmr();
		putwt();
		System.out.println("total score="+total);
	}
}
class inter
{
	 public static void main(String[] args) {
		C obj=new C();
		obj.getmarks(3,5);
		obj.getdata(4);
		obj.display();
	}
}