/*Write a program which will calculate factorial of small numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class fctrl2 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,inpNum;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
			inpNum=Integer.parseInt(in.readLine());
			System.out.println(factorial(inpNum));
			testCases--;
		}
	}

	public static int factorial(int num)
	{
		int fac=1;
		while(num>0)
		{
			fac*=num;
			num--;
		}
		return fac;
	}
}