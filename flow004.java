/*Write a program which will show the sum of first and last digit
of the number*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class flow004 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,num,firstDigit,lastDigit,sum;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			sum=0;
			num=Integer.parseInt(inp.readLine());
			if(num%10==0 || num<10)
			{
               if(num<10)
               	sum=num;
               else
               	while(num>=10)
               		num/=10;
               	sum=num;
               
			}
			else
			{
				sum+=num%10;
				while(num>10)
					num/=10;
				sum+=num;
			}
			System.out.println(sum);
			testCases--;
		}
	}
}