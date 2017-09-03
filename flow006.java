/*This program will add and produce sum of digits*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class flow006 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,number,totalSumDigits;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			totalSumDigits=0;
			number=Integer.parseInt(inp.readLine());
			while(number>0)
			{
				totalSumDigits+=number%10;
				number=number/10;
			}
			System.out.println(totalSumDigits);
			testCases--;
		}
	}
}