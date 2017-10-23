//This program will check whatever there exist a string 
#include<iostream>
using namespace std;
#include<string>
int main()
{
	int testCases;
	string input;
	cin>>testCases;
	while(testCases--)
	{
		int arr[26];
		for(int i=0;i<26;i++)arr[i]=0;
		cin>>input;
		for(int i=0;i<input.length();i++)
		{
			++arr[(int)input[i]-97];
		}

		
	}
}