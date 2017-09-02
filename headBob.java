/*Write a program which will show the headBob condition and will show 
the output related to it on screen.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class headBob 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,gesture[],size;
		String p;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			 gesture=new int[3];
             size=Integer.parseInt(inp.readLine());
             p=inp.readLine();
             for(int i=0;i<p.length();i++)
             {
             	if(p.charAt(i)=='Y')
             		++gesture[0];
             	else if(p.charAt(i)=='N')
             		++gesture[1];
             	else 
             		++gesture[2];
             }

             if(gesture[2]>0)
             	System.out.println("INDIAN");
             else if(gesture[0]>0)
             	System.out.println("NOT INDIAN");
             else if(gesture[0]==0 && gesture[2]==0 && gesture[1]>0)
             	System.out.println("NOT SURE");
            


			testCases--;
		}
	}
}