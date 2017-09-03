/*Write a program which will sort an array and will show result */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class tsort 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int size,arr[];
		size=Integer.parseInt(in.readLine());
		arr=new int[size];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(in.readLine());
		tsort ob=new tsort();
		tsort.quickSort(arr,0,arr.length-1);
		tsort.printSorted(arr);
	}

    static void quickSort(int arr[],int low,int high)
    {
    	int part;
    	if(low<high)
    	{
        part=partition(arr,low,high);
        quickSort(arr,low,part-1);
        quickSort(arr,part+1,high);
    	}

    }
      
    static int partition(int arr[],int low,int high)
    {
    	int temp;
    	int pivot=arr[high];
    	int i=low-1;
    	for(int j=low;j<high;j++)
    	{
    		if(arr[j]<=pivot)
    		{
    			i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    		}
    	}
    	temp=arr[i+1];
    	arr[i+1]=arr[high];
    	arr[high]=temp;
    	return i+1;
    }

    static void printSorted(int arr[])
    {
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);	
    }

}