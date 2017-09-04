/*Write a program which will show the working of the digits which can be
made from the digit extracted*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class chefpdig 
{
	public static void main(String[] args) throws IOException
	{
	  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	  int testCases;
	  String p;
	  int arr[];
	  testCases=Integer.parseInt(in.readLine());
      while(testCases>0)
      {
      	arr=new int[10];
        p=in.readLine();
        for(int i=0;i<p.length();i++)
        {
        	++arr[(int)p.charAt(i)-48];
        }
        for(int i=6;i<10;i++)
        {
        	for(int j=0;j<10;j++)
        	{
        		if()
        	}
        }

      	testCases--;
      }
	}
}