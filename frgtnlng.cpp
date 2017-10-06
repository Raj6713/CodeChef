//forgotten language reincarted
#include<iostream>
using namespace std;
#include<string>
#include<vector>
int main()
{
	int testCases,forgottenWords,cases,num;
	string fg;
	cin>>testCases;
	vector <string> forgWords;
	while(testCases--)
	{
		cin>>forgottenWords>>cases;
		vector <string> forgWords;
		bool flag[forgottenWords];
		for(int i=0;i<forgottenWords;i++)
		{
			cin>>fg;
			forgWords.push_back(fg);
			flag[i]=false;
		}


		
		while(cases--)
		{
          cin>>num;
          for(int i=0;i<num;i++)
              cin>>fg;
             for(int i=0;i<forgottenWords;i++)
             {
             	if(fg==forgWords[i]) flag[i]=true;
             }
		}
         
         for(int i=0;i<forgottenWords;i++)
         {
         	if(flag[i]==true)
         		cout<<"YES ";
         	else
         		cout<<"NO ";
         }
         cout<<"\n";
	}
}