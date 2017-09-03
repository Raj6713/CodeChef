/*Write a program which will output wrong number for a codechef problem*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class cielab 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int number1,number2;
		String p;
		p=in.readLine();
		number1=Integer.parseInt(p.split(" ")[0]);
		number2=Integer.parseInt(p.split(" ")[1]);
		p=Integer.toString(number1-number2);
		p.charAt(1)=(char)(Integer.parseInt(p.charAt(1))+1)%10;
		System.out.println(p);

	}
}