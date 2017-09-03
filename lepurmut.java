/*This program will count the inversion */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class lepurmut 
{
	public static void main(String[] args) throws IOException
    {
    	BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
    	int testCases=Integer.parseInt(inp.readLine());
    	int arrSize,arr[],localInversion,globalInversion;
    	String p;
    	while(testCases>0)
    	{
    		localInversion=globalInversion=0;
            arrSize=Integer.parseInt(inp.readLine());
            arr=new int[arrSize];
            p=inp.readLine();
            for(int i=0;i<arrSize;i++)
            	arr[i]=Integer.parseInt(p.split(" ")[i]);
            for(int i=0;i<arrSize;i++)
            {
         
            	for(int j=i+1;j<arrSize;j++)
            	{

            		if(arr[i]>arr[j])
            			globalInversion++;
            	}
            }

            for(int i=0;i<arrSize-1;i++)
            {
            	   	if(arr[i]>arr[i+1])
            		localInversion++;
            }
         
            if(localInversion==globalInversion)
            	System.out.println("YES");
            else 
            	System.out.println("NO");

    		testCases--;
    	}
    }
}