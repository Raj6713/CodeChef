/*Write a program which will do the program as described by fctrl*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.math.*;
class fctrl 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int number,testCases;
    testCases=Integer.parseInt(in.readLine());
    while(testCases>0)
     { 
       number=Integer.parseInt(in.readLine());
       factorial(number);
	    testCases--;
      }
  }
	public static void factorial(int num)
	{
		int facto[]=new int[200000];
       facto[0]=1;
       int facto_Size=1;
       for(int x=2;x<=num;x++)
       {
       	facto_Size=multiply(x,facto,facto_Size);
       }
       String p="";

       for(int i=facto_Size-1;i>=0;i--)
       {
       	p+=Integer.toString(facto[i]);
       }
       System.out.println(p);
	}

	public static int multiply(int x,int facto[],int facto_Size)
	{

		int carry=0;
		for(int i=0;i<facto_Size;i++)
		{
			int product=facto[i]*x+carry;
			facto[i]=product%10;
			carry=product/10;
		}
		while(carry>0)
		{
			facto[facto_Size]=carry%10;
			carry=carry/10;
			facto_Size++;
		}
		return facto_Size;

	}
}