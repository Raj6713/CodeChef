/*Write a program which will translate the language from byteland in
simple plain english and show the results*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character;
class totr 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int conversation;
		String p,convertor,val;
		p=in.readLine();
		conversation=Integer.parseInt(p.split(" ")[0]);
        convertor=p.split(" ")[1];
		while(conversation>0)
		{     
           val=in.readLine();
           System.out.println(languageConvert(convertor,val));
			conversation--;
		}
	}

	public static String languageConvert(String s1,String s2)
	{
      String p="";

      for(int i=0;i<s2.length();i++)
      {
      	if(s2.charAt(i)=='_')
      		p+=" ";
      	else if((int)s2.charAt(i)<=122 && (int)s2.charAt(i)>=97)
      		p+=s1.charAt((int)s2.charAt(i)-97);
      	else if((int)s2.charAt(i)<=90  && (int)s2.charAt(i)>=65)
      		p+=Character.toUpperCase(s1.charAt((int)s2.charAt(i)-65));
      	else 
      		p+=s2.charAt(i);
      }
       return p;
	}
}