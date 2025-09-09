package basic;

public class Multiplecatchblock {
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.prinln("ArithmeticException e");
		}
	
catch(ArrayIndexOutofBoundsException e)
{
	System.out.println("ArrayIndexOutOfBoundsException e");
	
}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
}
}
