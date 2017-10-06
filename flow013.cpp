//Write a program which will check validity of traingle.
#include<iostream>
using namespace std;
#include<vector>
int main()
{
	int testCases;
	 int angles[3];
	cin>>testCases;
	int sum;
	while(testCases--)
	{
		sum=0;
		for(int i=0;i<3;i++)
		{	
			cin>>angles[i];
         if(angles[i]>0 && angles[i]<180)
         	{
         		sum+=angles[i];
            }
         }
        
          if(sum==180)
           	cout<<"YES"<<endl;
           else
           	cout<<"NO"<<endl;
	}

}