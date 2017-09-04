/*Problem for spetember long and will find the prefix sum and suffix sum*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class chefsum 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,arrSize,arr[],sum,index;
		String p;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{    index=-1;
			sum=Integer.MAX_VALUE;
			arrSize=Integer.parseInt(in.readLine());
			arr=new int[arrSize];
            p=in.readLine();
			for(int i=0;i<arrSize;i++)
				arr[i]=Integer.parseInt(p.split(" ")[i]);
            for(int i=0;i<arrSize;i++)
            {
            	if(sum>(prefixSum(arr,i)+suffixSum(arr,i)))
            		{sum=prefixSum(arr,i)+suffixSum(arr,i);
            	    index=i;}
            }
            System.out.println(index+1);
			testCases--;
		}
	}


	public static int prefixSum(int arr[],int k)
	{
		int sum=0;
		for(int i=0;i<=k;i++)
          sum+=arr[i];
      return sum;
	}

	public static int suffixSum(int arr[],int k)
	{
		int sum=0;
        for(int i=k;i<arr.length;i++)
        	sum+=arr[i];
        return sum;
	}
}