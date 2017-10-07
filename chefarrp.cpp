//Write a program which will check whatever a array have subarray being perfect
#include<iostream>
using namespace std;
#include<string>
bool checker(int *,int,int);
int main()
{

	int testCases,size,i,j,count;
	cin>>testCases;
	while(testCases--)
	{
		count=0;
      cin>>size;
      int arr[size];
      for(int i=0;i<size;i++)
      	cin>>arr[i];
      for(i=0;i<size;i++)
      {
      	for(j=i;j<size;j++)
      	{
            if(checker(arr,i,j)==true)
            	count++;
      	}
      }
      cout<<count<<endl;
	}
	return 0;
}


bool checker(int *a,int low,int high)
{
	long int sum,prod;
	sum=0;
	prod=1;
	for(int i=low;i<=high;i++)
	{
		sum+=*(a+i);
		prod*=*(a+i);
	}
	if(sum==prod)
		return true;
	else
		return false;
}