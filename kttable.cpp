//Write a program which will show the working of the kttable
#include<iostream>
using namespace std;
int main()
{
	register int testCases,size,count;
	cin>>testCases;
	while(testCases--)
	{
		count=0;
     cin>>size;
     int cookingTime[size],clockTime[size];
     for(int i=0;i<size;i++)
     	cin>>clockTime[i];
     for(int i=0;i<size;i++)
     	cin>>cookingTime[i];
     for(int i=size-1;i>=0;i--)
     	clockTime[i]-=clockTime[i-1];

     for(int i=0;i<size;i++)
     {
     	if(clockTime[i]>=cookingTime[i])
     	   {count++;}
     }
     cout<<count<<endl;
	}
}