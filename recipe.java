/*Write a program which will show the minimum amount given that the
values*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class recipe 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int testCases,arr[],size;
		testCases=Integer.parseInt(in.readLine());
		String p;
		while(testCases>0)
		{
			p=in.readLine();
			size=Integer.parseInt(p.split(" ")[0]);
			arr=new int[size];
			for(int i=0;i<size;i++)
			{
              arr[i]=Integer.parseInt(p.split(" ")[i+1]);
			}
			int small=Integer.MAX_VALUE;
			for(int i=0;i<size;i++)
			{
				if(arr[i]<small)
					small=arr[i];
			}

			boolean divides=true;
			for(int i=0;i<size;i++)
			{
				if(arr[i]%small!=0)
				{
					divides=false;
					break;
				}
			}
			if(divides==true)
			{
				for(int i=0;i<size-1;i++)
					System.out.printf("%d ",arr[i]/small);
                     System.out.println((int)arr[size-1]/small);
				     
			}
			else
			{
				for(int i=0;i<size-1;i++)
					System.out.printf("%d ",arr[i]);
                     System.out.println(arr[size-1]);
				    
			}
			
			testCases--;
		}
	}
}