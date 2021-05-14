//write a java program using exception to compute the arthematic exception if descriment become less than zero;
class MyException extends Exception
{
	MyException()
	{

	}
	MyException(String str)
	{
		supper(str);
	}
}
class userd
{
	public static void main(String[] args) {
		try
		{
			show();

		}
		catch(MyException me)
		{
			System.out.println(.........);
		}
		try{
		display();
	}
		catch(MyException me)
		void show()throws MyException
		{
			System.out.println("i am in show");
			throw new MyException()
		}
		void display() throws MyException
		{
			System.out.println("i am in show");
			throw new MyException()
		}
	}
}