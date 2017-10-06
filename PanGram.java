/*Write a program which will solve the pangram and find the cost of 
solving it.*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class PanGram
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int testCases;
    long totalPrice;
		int price[]=new int[26];
		String pangram,p;
		testCases=Integer.parseInt(input.readLine());
		for(int i=0;i<testCases;i++)
		{
          p=input.readLine();
          for(int j=0;j<26;j++)
          	price[j]=Integer.parseInt(p.split(" ")[j]);
          pangram=input.readLine();
          totalPrice=pricer(price,pangram);
          System.out.println(totalPrice);           
		}
	}
	

	public static long pricer(int[] p,String s)
	{
	   long sum=0;
	   boolean arp[]=new boolean[26];
      char c;
      for(int i=0;i<26;i++)
        	arp[i]=false;
       
       for(int i=0;i<s.length();i++)
       {
     	   c=s.charAt(i);
     	   arp[((int)c)-97]=new Boolean(true);
       }

       for(int i=0;i<arp.length;i++)
       {
     	  if(arp[i]==false)
             sum+=p[i];
        }
        return sum;
     }
     
}