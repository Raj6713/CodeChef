/*Write a program which will find the value of factorial and will show
it on the screen*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class factorial 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,number;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
            number=Integer.parseInt(inp.readLine());
            System.out.println(factorial(number));
            testCases--;
		}
	}

    public static long factorial(int num)
    {
      long fact=1;
      while(num>0)
      {
    	 fact*=num;
    	 num--;
      }
       return fact;
    }

}