//Bitwise or;
#include<iostream>
using namespace std;
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int testCases;
	cin>>testCases;
	long long int numbers;
	while(testCases--)
	{
		cin>>numbers;
		long long int a,i,b=0;
		for(int i=0;i<numbers;i++)
		{
			cin>>a;
			b=b|a;
		}
		cout<<b<<endl;
	}
	return 0;
}