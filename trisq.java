/*This program will check how much square of size 2 can be fixed into
a right angled square triange*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class trisq 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int testCases,base,output;
		int areaOfSquare=4;
		double areaOfTriangle;
		testCases=Integer.parseInt(input.readLine());
		for(int i=0;i<testCases;i++)
		{
           base=Integer.parseInt(input.readLine());
           base=base-2;
           base=base/2;
           output=base*(base+1)/2;
           System.out.println(output);
		}
	}
}