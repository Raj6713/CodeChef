/*Write a program which will use internal array sorter to sort*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class tsort1 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int size;
		size=Integer.parseInt(in.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        	arr[i]=Integer.parseInt(in.readLine());
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        	System.out.println(arr[i]);
	}
}