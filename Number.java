/*This program will take a number and than will output the same*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int number;
		number=Integer.parseInt(input.readLine());
		System.out.println(number);
	}
}