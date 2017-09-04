/*Write a program which will find zeros in the fctrl*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class fctrl1 
{
  public static void main(String[] args) throws IOException
  {
  	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  	int testCases,number,totalZeros;
  	testCases=Integer.parseInt(in.readLine());
  	while(testCases>0)
  	{
  		totalZeros=0;
  		number=Integer.parseInt(in.readLine());
  		number=number/5;
        while(number>=1)
        {
        	totalZeros=totalZeros+number;
        	number=number/5;
        }
         System.out.println(totalZeros);
  		testCases--;
  	}
  }
}