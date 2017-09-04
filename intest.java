/*Write a program which will check the data rate for the method*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class intest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String p;
		int testCases,k,count=0;
		p=in.readLine();
		testCases=Integer.parseInt(p.split(" ")[0]);
		k=Integer.parseInt(p.split(" ")[1]);
		while(testCases>0)
		{

           if(Integer.parseInt(in.readLine())%k==0)
           	    count++;
			testCases--;
		}
        System.out.println(count);
	}
}