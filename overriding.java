class super
{
	int x=10;
	void put(){
		Sustem.out.println("the value is "+x);
	}
}
class sub extends super
{
	int y=20;
	void put()
	{
		System.out.println("the value is "+x);
		Sustem.out.println("the value is "+y);
	}
}
class overriding
{
	public static void main(String ar[])
	{
		sub obj=new sub();
		obj.put();

	}
}