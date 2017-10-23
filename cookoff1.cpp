#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main()
{
	int testCases;
	cin>>testCases;
	while(testCases--)
	{
		int size,newElements;
		cin>>size>>newElements;
        int newSize=size+newElements;
        int arr[size];
        for(int i=0;i<size;i++)
        	cin>>arr[i];
        sort(arr,arr+size);
       int arr1[newSize];
       for(int i=0;i<newSize;i++)
       	arr1[i]=arr[i];
       int k=size;
       if(k%2==0)
       {
       	k=k+newElements;
       	k=k-1;
         cout<<arr1[k/2]<<endl;
       }
       else
       {
       	k=k+newElements;
       	k=k-1;
       	cout<<arr1[k/2]<<endl;
       }

	}
	return 0;
}