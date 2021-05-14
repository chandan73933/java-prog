class A
{
	int a,b,c,d,area,vol;
	void getdata(int x,int y)
	{
		a=x; 
		b=y;
		System.out.println("enter the data of X:->"+a);
		System.out.println(" enter the data of Y:->"+b);
	}

	void calc()
	{
		area=a*b;
		System.out.println("the total area is"+area);

	}
}
class B extends A
{
	void dispaly(int z,int p)
	{
		c=z;
		d=p;
		System.out.println("enetr the value of c"+c);
		System.out.println("enter the value of b"+p);
	}
	void put()
	{
		vol=a*b*c;
		System.out.println("the value of vol :->"+vol);
	}

}
class C extends B
{
	void total()
	{
		System.out.println(""+area);
		System.out.println(""+vol);
	}
}
class x
{
	public static void main(String[] args) {
	C obj=new C();
	obj.getdata(4,6);
	obj.calc();
	obj.dispaly(5,7);
	obj.put();
	obj.total();	

	}
}