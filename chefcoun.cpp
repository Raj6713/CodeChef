//This program will create a file such that the value will produce the
//wrong answer for the value;
#include<iostream>
using namespace std;
#include<cstdlib>
#include<climits>
int main()
{
	int max,size;
	max=INT_MAX;
	cin>>size;
	unsigned int arr[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=rand()%100000 +max;
	}

	for(int i=0;i<size;i++)
		cout<<arr[i]<<" ";
	cout<<;endl;

}