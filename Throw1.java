package basic;

public class Throw1 {
	static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied");
		}
		else
		{
			System.out.println("Access granted");	
			}
	}
	public static void main(String[]args)
	{
		try
		{
		checkage(19);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught:"+e.getMessage());
		}
	}

}
