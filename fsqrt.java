/*Write a program which will find the square root of a number and will
show it on the screen*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
class fsqrt 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        int testCases,num;
        testCases=Integer.parseInt(inp.readLine());
        while(testCases>0)
        {
          num=Integer.parseInt(inp.readLine());
          System.out.println((int)Math.sqrt(num));
          testCases--;
        }		

	}
}