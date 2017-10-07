//chef tries to take leap and solve a problem
//author: raj6713631@gmail.com
#include<iostream>
using namespace std;
#include<cstdlib>
#include<climits>
#include<math.h>
int main()
{
	int testCases,dishes;
	cin>>testCases;
	while(testCases--)
	{

		cin>>dishes;
		int maximum[dishes];
		int minimum[dishes];
		for(int i=0;i<dishes;i++)
		{
			int min,max;
			min=INT_MAX;
			max=INT_MIN;
			int t,num;;
			cin>>t;
			for(int j=0;j<t;j++)
			{
               cin>>num;
               if(num>max) max=num;
               if(num<min) min=num;
			}
		  maximum[i]=max;
		  minimum[i]=min;	
		}
        long int sum=0;
       for(int i=1;i<dishes;i++)
           sum+=(i)*abs(minimum[i-1]-maximum[i]);
       cout<<sum<<endl;
	}

}