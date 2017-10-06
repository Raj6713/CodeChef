/*Write a program which will solve the program and show the output*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character;
class nitika 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases;
		String p;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
			p=in.readLine();
			System.out.println(shortcut(p));
			testCases--;
		}
	}

	public static String shortcut(String p)
	{
		String chirpy="";
		int spaceCount=0;
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)==' ')
				spaceCount++;
		}
		
	}
}