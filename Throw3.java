package basic;

public class Throw3 {
	static void validatelogin(String username,String password)
	{
		if(!username.equals("admin")|| !password.equals("1234"))
		{
			throw new SecurityException("Inavlid data");
		}
		else
		{
			System.out.println("login success");
		}
	}
	public static void main(String[]args)
	{
		try
		{
		validatelogin("admin","1111");
	    }
		catch(SecurityException e)
		{
			System.out.println("Login failed:"+e.getMessage());
		}
		try
		{
		validatelogin("admin","1234");
	    }
		catch(SecurityException e)
		{
			System.out.println(""+e.getMessage());
		}
	}

}
