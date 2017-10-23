#include<iostream>
using namespace std;
#include<vector>
#include<math.h>
long long int countpairs(long long int num);
int main()
{
	int testCases;
	cin>>testCases;
	while(testCases--)
	{
	   long	long int value;
		cin>>value;
		cout<<countpairs(value)<<endl;
	}
	return 0;
}

long long int countpairs(long long int num)
{
	
	long long int totalCount=0;
	long long int arr[701];
	for(int i=1;i<=700;i++)
		arr[i]=num-i;
    for(int i=1;i<=700;i++)
    {
    	if(arr[i]>=0)
    	{
        
        totalCount+=(int)sqrt(arr[i]);
    	}
    }
    return totalCount;
}
