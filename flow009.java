/*Write a program which will fnd the total price and will show output*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class flow009 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int testCases,quantity,price;
	String p;
	testCases=Integer.parseInt(in.readLine());
	while(testCases>0)
	{
		p=in.readLine();
		quantity=Integer.parseInt(p.split(" ")[0]);
        price=Integer.parseInt(p.split(" ")[1]);
        if(quantity>1000)
        {
           System.out.printf("%.6f\n",(double)0.9*quantity*price);
        }
        else
        {
         System.out.printf("%.6f\n",(double)quantity*price);
        }
		testCases--;
	}
	}
}