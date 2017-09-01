/*This program will find the remainder when a number A is being divided
by another number b and will show output*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class flow002
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int testCases,a,b;
		String p;
		testCases=Integer.parseInt(input.readLine());
		for(int i=0;i<testCases;i++)
		{
          p=input.readLine();
          a=Integer.parseInt(p.split(" ")[0]);
          b=Integer.parseInt(p.split(" ")[1]);
          System.out.println(a%b);
		}
	}
}