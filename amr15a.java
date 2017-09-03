/*This program will show the working of the array and will show output
such that the battle is winnable or not*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class amr15a 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		int armySize,evenCount,oddCount;
		evenCount=oddCount=0;
		armySize=Integer.parseInt(inp.readLine());
		int arr[]=new int[armySize];
		String p=inp.readLine();
		for(int i=0;i<armySize;i++)
		{	arr[i]=Integer.parseInt(p.split(" ")[i]);
	         if(arr[i]%2==0)
	         	evenCount++;
	         else
	         	oddCount++;
	    }
	    if(evenCount>oddCount)
	    	System.out.println("READY FOR BATTLE");
	    else
	    	System.out.println("NOT READY");
          
	}
	
}