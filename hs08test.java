/*Write a program which will withdraw cash for pooja*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class hs08test 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int cashToWithdraw;
		double balance;
		String p;
		p=in.readLine();
		cashToWithdraw=Integer.parseInt(p.split(" ")[0]);
		balance=Double.parseDouble(p.split(" ")[1]);
		if(cashToWithdraw%5==0)
		{
            double totalWithdraw;
            totalWithdraw=cashToWithdraw+0.50;
            if(totalWithdraw<balance)
               System.out.printf("%.2f\n",balance-totalWithdraw);
            else
            	System.out.printf("%.2f\n",balance);
		}
		else
		{
			System.out.printf("%.2f\n",balance);
		}
	}
}