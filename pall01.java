/*Write a program which will show the working of the palindrome string 
and also its output*/
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.lang.*;
class pall01 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases;
		String s1,s2;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
            s1=inp.readLine();
            if(s1.charAt(0)!='0')
            {
            s2=reverseString(s1);
            if(s1.equals(s2))
            	System.out.println("wins");
            else
            	System.out.println("losses");
        }
            testCases--;
		}

	}

	public static String reverseString(String s1)
	{
		String s="";
		for(int i=0;i<s1.length();i++)
			s+=s1.charAt(s1.length()-i-1);
		return s;
	}
}