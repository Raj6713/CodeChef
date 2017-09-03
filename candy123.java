/*This program will show how much candies can be eaten by the bob and 
and limak and show it on the screen.*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class candy123 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int testCases,bob,limak,countBob,countLimak,i;
		String p;

		testCases=Integer.parseInt(inp.readLine());
		while(testCases>0)
		{

	     countBob=countLimak=i=0;
         p=inp.readLine();
         limak=Integer.parseInt(p.split(" ")[0]);
         bob=Integer.parseInt(p.split(" ")[1]);
         countBob=2*i+2;
         countLimak=2*i+1;
         limak=limak-countLimak;
         bob=bob-countBob;
         

            i++;
			testCases--;
		}
	}
}