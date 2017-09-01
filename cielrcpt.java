/*Write a program which will find the minimum number of items which
can ordered such that it satisfies a total price*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
class cielrcpt 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,totalAmount,count,maxPrice,i;
		maxPrice=
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			i=11;
			count=0;
			totalAmount=Integer.parseInt(inp.readLine());
			while(totalAmount>0)
			{

				count+=totalAmount/(int)Math.pow(2,i);
				totalAmount=totalAmount%(int)Math.pow(2,i);
				i--;
			}
			System.out.println(count);
          testCases--;
		}
	}
}