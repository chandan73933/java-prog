class Room
{
	int len,breadth;
	void getdata(int x,int y)
	{
		len=x;
		breadth=y;
	}
	int area()
	{
		System.out.println("the area is ");
		return(len*breadth);
	}
}
class BedRoom extends Room{
	int height;
	void getdetail(int x,int y,int z)
	{
		len=x;
		breadth=y;
		height=z;

	}
	int volume()
	{
		System.out.println("the volume is");
		return(len*breadth*height);
	}
}
class l {
	public static void main(String ar[])
	{
		BedRoom obj=new BedRoom();
		obj.getdata(10,20);
		obj.getdetail(10,20,30);
		int area=obj.area();
		int volume=obj.volume();
		System.out.println("area is"+area);
		System.out.println("volume is"+volume);




	}
}






