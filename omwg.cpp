//Write a program which will show the working of the gven
#include<iostream>
using namespace std;
int main()
{
	int row,column,testCases;
	cin>>testCases;
	while(testCases--)
	{
		cin>>row>>column;
		cout<<(row*(column-1)+column*(row-1))<<endl;
	}
	return 0;
}