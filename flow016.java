/*Write a program which will find out the greatest common divisor 
and lowest commom multiple of two numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class flow016
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,num1,num2;
		String p;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
			p=in.readLine();
			num1=Integer.parseInt(p.split(" ")[0]);
			num2=Integer.parseInt(p.split(" ")[1]);
			int gcd=gcdCal(num1,num2);
			System.out.println(gcd+" "+num1*num2/gcd);
			testCases--;
		}
	}
	public static int gcdCal(int n1,int n2)
	{
		if(n2!=0)
			return gcdCal(n2,n1%n2);
		else
			return n1;
	}
}