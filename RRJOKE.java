/*This program will work on optimality and will show the otput*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class RRJOKE 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String p;
		int testCases,point,x,y,ans,count;
		testCases=Integer.parseInt(input.readLine());
		for(int i=0;i<testCases;i++)
		{
			point=Integer.parseInt(input.readLine());
            ans=count=0;
            while(point>0)
            {
               p=input.readLine();
               x=Integer.parseInt(p.split(" ")[0]);
               y=Integer.parseInt(p.split(" ")[1]);
               count++;
               ans=ans^count;
               point--;
            }
            System.out.println(ans);
		}
	}
}