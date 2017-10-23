//Change the name;
#include<iostream>
using namespace std;
#include<vector>
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	string name;
	int testCases,counter;
	cin>>testCases;
	while(testCases--)
	{
		counter=0;
		string message="";
        cin>>name;
        for(int i=0;i<name.length();i++)
        {
      	  if(name[i]==' ')counter++; 
        }  
    
    
        if(counter==0)
        {
        	message+=toupper(name[0]);
        	for(int i=1;i<name.length();i++)
        		message+=tolower(name[i]); 
        }
        
        if(counter==1)
        {
        	int i;
        	message+=toupper(name[0]);
        	for(i=0;i<name.length();i++)
        		if(name[i]==' ')break;
            i++;
            message+=toupper(name[i]);
        	for(int k=i+1;k<name.length();k++)
        		message+=tolower(name[k]);
        }


        if(counter==2)
        {
        	int i,k;
        		message+=toupper(name[0]);
        	for(i=0;i<name.length();i++)
        		if(name[i]==' ')break;
            i++;
            message+=toupper(name[i]);
              
            for(k=i+1;k<name.length();k++)
             if(name[k]==' ')break;
            k++; 
            message+=toupper(name[k]);

        	for(i=k+1;k<name.length();k++)
        		message+=tolower(name[k]);
        }
        cout<<message<<endl;

	}
	return 0;
}