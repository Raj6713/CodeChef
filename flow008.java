/*Write a program which will take numbers and will show a message*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class flow008 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,num;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			num=Integer.parseInt(inp.readLine());
			if(num<10)
				System.out.println("What an obedient servant you are!");
			else
				System.out.println(-1);

			testCases--;
		}
	}
}