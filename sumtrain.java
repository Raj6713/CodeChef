/*Write a program which will find the largest among the triangle formed*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class sumtrain 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,size,num;
		String p;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
			int max=Integer.MIN_VALUE;
			size=Integer.parseInt(in.readLine());
            for(int i=0;i<size;i++)
            {
            	p=in.readLine();
                for(int j=0;j<=i;j++)
                {
                	num=Integer.parseInt(p.split(" ")[i]);
                	if(num>max)
                		max=num;
                }
            }
          System.out.println(max);
          testCases--;
		}
	}
}