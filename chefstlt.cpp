//This program will solve the chef problem for the sttring
#include<iostream>
using namespace std;
#include<string>
int maximum(string,string);
int minimum(string, string);
int main()
{
	string input1,input2;
	int testCases;
	cin>>testCases;
	while(testCases--)
	{
		cin>>input1>>input2;
		cout<<minimum(input1,input2)<<" ";
		cout<<maximum(input1,input2)<<endl;
	}
	return 0;
}
int minimum(string s1,string s2)
{
	int min=0;
    for(int i=0;i<s1.length();i++)
    {
    	if(s1[i]!=s2[i] && s1[i]!='?' && s2[i]!='?')
    		min++;
    }
    return min;
	
}

int maximum(string s1,string s2)
{
   int max=0;
   for(int i=0;i<s1.length();i++)
   {
   	if(s1[i]!=s2[i] || s1[i]=='?' || s2[i]=='?')
   		max++;
   }
   return max;
}