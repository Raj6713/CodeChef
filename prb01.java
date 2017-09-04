/*Write a program which wll find whatever a number is prime or not*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
class prb01
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int testCases,number;
	boolean type=false;
	testCases=Integer.parseInt(in.readLine());
	while(testCases>0)
	 {
		number=Integer.parseInt(in.readLine());
        type=primeTest(number);
       if(type==true)
       	System.out.println("yes");
       else
       	System.out.println("no");
		testCases--;
	 }
	}
	public static boolean primeTest(int  num)
	{
      int upperLimit=(int)Math.sqrt(num)+1;
      boolean flag=true;
      for(int i=2;i<=upperLimit;i++)
      {
      	if(num%i==0)
      		flag=false;
      }
      if(num==2)
      	return true;
      else
      return flag;
	}
}