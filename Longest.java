/*Write a program which will fnd the longest common subsequence to form
the palindrom string*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Longest 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		String s1,s2;
		int testCases,arr1[],arr2[],count;
		
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
			arr1=new int[26];
		    arr2=new int[26];
			count=0;
			s1=inp.readLine();
			s2=inp.readLine();
            for(int i=0;i<s1.length();i++)
            	++arr1[(int)s1.charAt(i)-97];
            for(int i=0;i<s2.length();i++)
            	++arr2[(int)s2.charAt(i)-97];
            for(int i=0;i<arr1.length;i++)
            {
            	if(arr1[i]%2==0 && arr1[i]!=0)
            		count+=arr1[i];
            	if(arr2[i]%2==0 && arr2[i]!=0)
            		count+=arr2[i];
            }
            System.out.println(count);
			testCases--;
		}
	}
}