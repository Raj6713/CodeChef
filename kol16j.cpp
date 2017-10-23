#include<iostream>
using namespace std;
#include<climits>
#include<vector>
bool quarentin(int [],int);
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int testCases,chapters;
	cin>>testCases;
	while(testCases--)
	{
		cin>>chapters;
		int arr[chapters];
		for(int i=0;i<chapters;i++)
			cin>>arr[i];
		if(quarentin(arr,chapters))
			cout<<"yes"<<endl;
		else
			cout<<"no"<<endl;
	}
	return 0;
}


bool quarentin(int a[],int size)
{
    int max=INT_MIN;
    for(int i=0;i<size;i++)
    {
    	if(a[i]>max)
    		max=a[i];
    }
    int arr[max+1]={0};
    for(int i=0;i<size;i++)
        ++arr[a[i]];
   

    if(a[0]==1)
    	return false;
    else
    {
    	for(int i=1;i<size+1;i++)
    	{
    		if(arr[i]!=1)
    			return false;
    	}
    	return true;
    }


}
