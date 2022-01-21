
public class exceHandling {
	static void age(int a)
	{
		//creating error
		if(a<18)
			throw new ArithmeticException("candidate not eligible");
		else
			System.out.println("eligible");
	}

	public static void main(String[] args) {
		age(20);
		age(11);
		try{
			int arr[]=new int[5];
			arr[6]=10;
			int k=10/0 ;
			String s=null;
			System.out.println(s.length());
		}
		//handling each error
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Check array length");
			
		}
		/*catch(ArithmeticException e1)
		{
			System.out.println(e1);
			System.out.println("Denominator can't be 0");
		}
		//multiple exceptions
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("might be AIOB or AE error");
		}
		
		//to handle all errors
		catch(Exception e)
		{
			System.out.println("all in one");
		}*/
		
		//finally block executes independently irrespective of error
		
		finally
		{
			System.out.println("handle errors");
		}

	}

}
