/*test of univers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class test 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int num;
		for(;;)
		{
		    num=Integer.parseInt(in.readLine());
		    if(num==42)
		    	break;
		    System.out.println(num);
		}
	}
}