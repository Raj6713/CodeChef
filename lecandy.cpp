//Write a program which will satisfy elephant need
#include<iostream>
using namespace std;
int main()
{
	bool flag=false;
	register int i,j,k;
	int elephant,totalCandies,testCases;
	cin>>testCases;
	for( i=0;i<testCases;i++)
	{
		cin>>elephant>>totalCandies;
		int arr[elephant];
		for(j=0;j<elephant;j++)
			cin>>arr[j];

        for(k=0;k<elephant;k++)
        {
        	if(arr[k]<=totalCandies)
        	{
        		totalCandies=totalCandies-arr[k];
        		flag=true;
        	}
        	else
        	{
        		flag=false;
        		break;
        	}
        }
        if(flag==true)
        	cout<<"Yes\n";
        else if(flag==false)
        	cout<<"No\n";
	}
	return 0;
}