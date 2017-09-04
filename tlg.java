/*Write a program which will find the winner in a game of billiards
and will show it on the screen.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class tlg 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int rounds,player1[],player2[],num1,num2,c=0;
		String p;
		p=in.readLine();
		rounds=Integer.parseInt(p);
		num1=rounds;
		player1=new int[rounds];
		player2=new int[rounds];
		while(rounds>0)
		{
			p=in.readLine();
            player1[c]=Integer.parseInt(p.split(" ")[0]);
            palyer2[c]=Integer.parseInt(p.split(" ")[0]);
            c++;
			rounds--;
		}

         
		for(int i=1;i<num1;i++)
		{
         player1[i]=player1[i]+player1[i-1];
         player2[i]=player2[i]+player2[i-1];
		}

       int lead1,lead2;
       for(int i=0;i<num1;i++)
       {
       	if(player1[i]>player2[i])
       	{
            
       	}
       	else if()
       	{

       	}
       }

        




	}
}