//class result extends student implements sport
class student
{
	int x,y;
	void getdata(int a,int b)
	{
		x=a;
		y=b;
	}
	void putdata()
	{
		System.out.println("");
		System.out.println("");
	}
}
interface sports
{
	int sp=6;
	void spmarks();

}
class result extends student implements sports
{
	public void spmarks()
	{
		System.out.println("sports marks "+sp);
	}
	void disp()
	{
		putdata();
		spmarks();
		int total = x+y+sp;
		System.out.println("total"+total);
	}
}
class inter
{
	public static void main(String[] args) 
	{
		result obj=new result();
		obj.getdata(23,56);
		obj.disp();
	}
}