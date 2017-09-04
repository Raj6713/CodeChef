/*Problem for spetember long and will find the prefix sum and suffix sum*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class chefsum1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,arrSize,arr[],sum,summer1[],summer2[],index;
		String p;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{    index=-1;
			sum=Integer.MAX_VALUE;
			arrSize=Integer.parseInt(in.readLine());
			arr=new int[arrSize];
			summer1=new int[arrSize];
            p=in.readLine();
			for(int i=0;i<arrSize;i++)
				arr[i]=Integer.parseInt(p.split(" ")[i]);
            summer1[0]=arr[0];
            int total=arr[0];
            for(int i=1;i<arrSize;i++)
            {
            	summer1[i]=summer1[i-1]+arr[i];
            	total+=arr[i];
            }


            summer2=new int[arrSize];
            for(int i=0;i<arrSize;i++)
            {
               summer2[i]=total-summer1[i]+arr[i];
            }  
            for(int i=0;i<arrSize;i++)
            {
            	if(sum>(summer1[i]+summer2[i]))
            		{sum=summer1[i]+summer2[i];
            	    index=i;}
            }
            System.out.println(index+1);
			testCases--;
		}
	}
}