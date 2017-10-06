#include<iostream>
using namespace std;
#include<string>
int main()
{
	
	int testCases,cases;
	string input;
	int arr[5];
	cin>>testCases;
	while(testCases--)
	{
		bool flag=true;
		for(int i=0;i<5;i++)
			arr[i]=0;

     cin>>cases;
     for(int i=0;i<cases;i++)
     {
     	cin>>input;
        if(input=="cakewalk")
        	++arr[0];
        if(input=="simple")
        	++arr[1];
        if(input=="easy")
           ++arr[2];
        if(input=="easy-medium"||input=="medium")
        	++arr[3];
        if(input=="medium-hard" || input=="hard")
        	++arr[4];
     }
     for(int i=0;i<5;i++)
     {
     	if(arr[i]==0)
          {flag=false; break;}
     }

     if(flag==false)
     	cout<<"No"<<endl;
     else
     	cout<<"Yes"<<endl;
	}
	return 0;
}