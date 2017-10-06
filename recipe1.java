/*recipe1.java Raj Kumar*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class recipe1 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,size,arr[];
		String p;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
            p=in.readLine();
            size=Integer.parseInt(p.split(" ")[0]);
            arr=new int[size];
            for(int i=0;i<size;i++)
               arr[i]=Integer.parseInt(p.split(" ")[i+1]);
           int value=arr[0];
           for(int i=0;i<arr.length;i++)
           {
           	value=gcd(value,arr[i]);
           }

           for(int i=0;i<arr.length-1;i++)
               System.out.printf("%d ",arr[i]/value);
               System.out.println((int)arr[size-1]/value);
			testCases--;
		}
	}

	public static int gcd(int n1,int n2)
	{
		if(n2==0)
			return n1;
		else
			return gcd(n2,n1%n2);
	}
}