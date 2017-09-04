/*This program will check whatever two numbers have which type of
relation*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class choprt 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,num1,num2;
		String s;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
         s=in.readLine();
         num1=Integer.parseInt(s.split(" ")[0]);
         num2=Integer.parseInt(s.split(" ")[1]);
         
        
         if(num1>num2)
         	System.out.println(">");
         else if(num1<num2)
         	System.out.println("<");
         else if(num1==num2)
         	System.out.println("=");

         testCases--;
		
	   }
	}
}