//This program will solve proble for chef to buy notebook
#include<iostream>
using namespace std;
#include<vector>
int main()
{
	register int testCases,totalPages,noteBookPages,ruble,requiredPages,notebooks;
	register int price,pages;
	bool flag;
	cin>>testCases;
	while(testCases--)
	{
		flag=false;
		cin>>totalPages>>noteBookPages>>ruble>>notebooks;
		requiredPages=totalPages-noteBookPages;     
          for(int i=0;i<notebooks;i++)
          {
          	cin>>pages>>price;
          	if(pages>=requiredPages && price<=ruble)
          	{
          		flag=true;
          	}
          }
          if(flag==true)
          cout<<"LuckyChef\n";
          else
          cout<<"UnluckyChef\n";   
		

	}
	return 0;
}