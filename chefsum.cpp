//chef solves a new problem
#include<iostream>
using namespace std;
#include<climits>
inline long int summer(int *,int index,int size);
int main()
{
	int testCases,size,index;
	long int minimum;
	cin>>testCases;
	while(testCases--)
	{
		minimum=LONG_MAX;
		cin>>size;
		int *arr=new int[size];
		for(int i=0;i<size;i++)
			cin>>*(arr+i);
		
		for(int i=size-1;i>=0;i--)
		{
			long int val=summer(arr,i,size);
			if(val<=minimum)
				{index=i;minimum=val;}
		}
		
		cout<<index+1<<endl;
	}
	return 0;
}

inline long int summer(int *arr, int index,int size)
{
	long int prevSum,afterSum;
	prevSum=afterSum=0;
	for(int i=0;i<=index;i++)
		prevSum+=*(arr+i);
	for(int i=size-1;i>=index;i--)
		afterSum+=*(arr+i);
	return prevSum+afterSum;
}