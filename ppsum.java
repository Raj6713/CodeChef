/*Write a program which will show the sum of number in
recursive form.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ppsum 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,d,n,value;
		String p;
		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{
            p=inp.readLine();
            d=Integer.parseInt(p.split(" ")[0]);
            n=Integer.parseInt(p.split(" ")[1]);
            value=sum(d,n);
            System.out.println(value);
			testCases--;
		}
	}

	public static int sum(int d, int n)
	{
		int su;
		su=n*(n+1)/2;
		if(d==0)
			return n;
		else
		return sum(d-1,su);
	}
}