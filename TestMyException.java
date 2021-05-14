import java.util.Scanner;
class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}
class TestMyException
{
	public static void main(String ar[])
	{
		int x=5;
		int y=1000;
	
	try
	{
		float z=(float) x/(float) y;
		if(z < 0.01)
		{

			throw new MyException("num");
		}
	}
	catch(MyException e)
	{
		System.out.println("caught th exception");
		System.out.println(e.getMessage());

	}
	finally
	{
		System.out.println("hello");
	}
}
}