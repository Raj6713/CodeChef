/*Write a program which will find second largest among three numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class flow017 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,num[],secondLarge,firstLarge;
		String p;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			firstLarge=secondLarge=Integer.MIN_VALUE;
          p=inp.readLine();
          num=new int[3];
          for(int i=0;i<3;i++)
          	num[i]=Integer.parseInt(p.split(" ")[i]);
           for(int i=0;i<num.length;i++)
           {
           	if(num[i]>firstLarge)
           	{
           		secondLarge=firstLarge;
           		firstLarge=num[i];           		
           	}
           	else if(num[i]>secondLarge && num[i]!=firstLarge)
           		secondLarge=num[i];
           }
            System.out.println(secondLarge);       
         testCases--;
		}
	}
}