package basic;

public class Throw2 {
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
		checkage(15);
	}

}
