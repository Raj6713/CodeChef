/*This program will take and array with constraints and will check 
whatever they form and rainbow array or not.*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Rainbow
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int testCases,arraySize;
		testCases=Integer.parseInt(input.readLine());
		arraySize=Integer.parseInt(input.readLine());
		int arr[]=new int[arraySize];
		String p=input.readLine();
		for(int i=1;i<=arraySize;i++)
			arr[i]=Integer.parseInt(p.split(" ")[i]);

		

	}
}