/*Write a program which will show the maximum and minimum time chef has 
entered the building*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class remiss 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,guardCount1,guardCount2,min;
		String p;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
          p=inp.readLine();
          guardCount1=Integer.parseInt(p.split(" ")[0]);
          guardCount2=Integer.parseInt(p.split(" ")[1]);
          if(guardCount1<guardCount2)
          	min=guardCount2;
          else
          	min=guardCount1;
          System.out.printf("%d %d\n",min,guardCount1+guardCount2);
          testCases--;
		}
	}
}