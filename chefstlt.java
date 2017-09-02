/*Write a program which will take two string and find the maximum and 
minimum difference between them so that they will be similar*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class chefstlt 
{
	public static void main(String[] args) throws IOException 
	{
      BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
      String s1,s2;
      int testCases,min,max;
      testCases=Integer.parseInt(inp.readLine());
      while(testCases>0)
      {
      	s1=inp.readLine();
      	s2=inp.readLine();
        min=minumum(s1,s2);
        max=maximum(s1,s2);
        System.out.printf("%d %d\n",min,max);
      }
	}

	public static int minimum(String s1,String s2)
	{
        
	}

	public static int maximum(String s1,String s2)
	{

	}
}