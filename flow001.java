/*Write a program which will add two numbers and will show it on the screen*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class flow001
{
	public static void main(String[] args) throws IOException 
	{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int testCases,num1,num2;
	String p;
	testCases=Integer.parseInt(in.readLine());
	while(testCases>0)
	{
		p=in.readLine();
		num1=Integer.parseInt(p.split(" ")[0]);
		num2=Integer.parseInt(p.split(" ")[1]);
		System.out.println(num1+num2);
		testCases--;
	}
	}
}