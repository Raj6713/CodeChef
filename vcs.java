/*Write a program which will find tracked and igonored files*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class vcs 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,total,tracked,ignored,count0,count2;
		int trackedFiles[];
		int ignoredFiles[];
		int totalFiles[];
		String p;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			count0=count2=0;
         p=inp.readLine();
         total=Integer.parseInt(p.split(" ")[0]);
         tracked=Integer.parseInt(p.split(" ")[1]);
         ignored=Integer.parseInt(p.split(" ")[2]);
                 
         ignoredFiles=new int[ignored+1];
         trackedFiles=new int[tracked+1];
         totalFiles=new int[total+1];
         
         p=inp.readLine();
         for(int i=1;i<=tracked;i++)
         	trackedFiles[i]=Integer.parseInt(p.split(" ")[i-1]);

         p=inp.readLine();
         for(int i=1;i<=ignored;i++)
         	ignoredFiles[i]=Integer.parseInt(p.split(" ")[i-1]);

         for(int i=1;i<=tracked;i++)
         	++totalFiles[trackedFiles[i]];
         for(int i=1;i<=ignored;i++)
         	++totalFiles[ignoredFiles[i]];

         for(int i=1;i<=total;i++)
         {
         	if(totalFiles[i]==0)
         		count0++;
         	if(totalFiles[i]==2)
         		count2++;
         }
         System.out.printf("%d %d\n",count2,count0);
			testCases--;
		}
	}
}