/*Write a program which will search the occurence of four in a number*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class luckfour 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int testCases,count;
		String p;
		testCases=Integer.parseInt(input.readLine());
		for(int i=0;i<testCases;i++)
		{
			count=0;
			p=input.readLine();
			for(int j=0;j<p.length();j++)
			{
				if(p.charAt(j)=='4')
					count++;
			}
			System.out.println(count);
		}
	}
}