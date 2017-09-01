/*Write a program which will find the smallest number of notes to
complete an amount.*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class flow005 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,amount,count;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			count=0;
			amount=Integer.parseInt(inp.readLine());
			count+=amount/100;
			amount=amount%100;
			count+=amount/50;
			amount=amount%50;
			count+=amount/10;
			amount=amount%10;
			count+=amount/5;
			amount=amount%5;
			count+=amount/2;
			amount=amount%2;
			count+=amount;
			System.out.println(count);
			testCases--;
		}
	}
}