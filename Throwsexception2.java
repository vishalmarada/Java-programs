package basic;
import java.io.*;

public class Throwsexception2 {
	static void ReadFile() throws IOException
	{
		FileReader fr=new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line= br.readLine();
		System.out.println("Firstline:"+line);
		
		br.close();
	}
	public static void main(String[]args)
	{
		try
		{
			ReadFile();
		}
		catch(IOException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
	
	

}
