class a
{
	int len;
	int bre;
	int area;
	a(int x,int y)
	{
		len=x;
		bre=y;
	}
	void calc()
	{
		area=len*bre;
		System.out.println("the area is "+area);
	}
}
class rec
{
	public static void main(String[] args) {
		a obj=new a(3,4);
		obj.calc();
	}
}