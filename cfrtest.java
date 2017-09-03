/*This program will test whatever friendship based on the values*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class cfrtest 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,size,arr[],max,arr1[],count;
		String p;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			count=0;
			max=Integer.MIN_VALUE;
			size=Integer.parseInt(inp.readLine());
            p=inp.readLine();
            arr=new int[size];
            for(int i=0;i<size;i++)
            	{
            		arr[i]=Integer.parseInt(p.split(" ")[i]);
            		if(arr[i]>max
            			max=arr[i];
            	}
            	arr1=new int[max+1];
            	for(int i=0;i<size;i++)
            	{
                   ++arr1[arr[i]];
            	}
            	for(int i=0;i<=max;i++)
            	{
            		if(arr1[i]>=1)
            			count++;
            	}

            System.out.println(count);
			testCases--;
		}
	}
}