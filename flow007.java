/*Write a program which will print reverse of a numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class flow007 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int testCases;
        testCases=Integer.parseInt(in.readLine());
        while(testCases>0)
        {
        	System.out.println(Integer.parseInt(reverser(in.readLine())));

        	testCases--;
        }		
	}

	public static String reverser(String g)
	{
		String p="";
		for(int i=g.length()-1;i>=0;i--)
			p+=g.charAt(i);
		return p;
	}
}