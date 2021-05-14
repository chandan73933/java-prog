class exc
{
	public static void main(String[] args) {
		int a[]={5,10};
		int b=5;
		int x;
		try
		{
			x=a[2] / b-a[1];
		}
		catch(ArithmeticException e)
		{
			System.out.println("d v s  o" );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("arrey index error");
		}
		catch(ArrayStoreException e)
		{
			System.out.println("wrong data type");
		}
		finally{
		
		System.out.println("i am in final");}
	}
}