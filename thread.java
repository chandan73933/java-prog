class A extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("\t from thread A :"+i);
		}
		System.out.println("exit from A");
		}
	}
class B extends thread
{
	public void run()
	{
		for(int j=1;j<5;j++)
		{
			System.out.println("\t from thread A :"+i);
		}
		System.out.println("exit from A");
		}
	}
	class C extends thread
{
	public void run()
	{
		for(int j=1;j<5;j++)
		{
			System.out.println("\t from thread A :"+i);
		}
		System.out.println("exit from A");
		}
	}
	class thread
	{
		 public static void main(String[] args) {
			new A().start();
			new B().start();
			new C().start();
		}
	}

		
