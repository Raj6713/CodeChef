//Chef tries to solve the occurence problem of a number
#include<iostream>
using namespace std;
#include<string>
#include<climits>
#include<vector>
int main()
{
	int testCases,max;
	string inputStr;
	cin>>testCases;
	while(testCases--)
	{ 
        max=INT_MIN;
		cin>>inputStr;
		int arr[26];
		for(int i=0;i<26;i++)arr[i]=0;
		for(int i=0;i<inputStr.length();i++)
		{
			++arr[(int)inputStr[i]-97];
		}
		

		for(int i=0;i<26;i++)
			cout<<arr[i]<<" ";
		cout<<endl;
		
		vector <int > characters;
		for(int i=0;i<inputStr.length();i++)
		{
			if(arr[i]!=0)
				characters.push_back(arr[i]);
		}

		for(auto i=characters.begin();i!=characters.end();i++)
			cout<<*i<<" ";
		cout<<endl;
        //for(auto i=characters.begin();i!=characters.end();i++)
        int arr1[characters.size()];
        int sum=0;
        for(int i=0;i<characters.size();i++)
        {
        	sum+=characters[i];
        }	
        for(int i=0;i<characters.size();i++)
        {
        	arr1[i]=sum-characters[i];
        }
        for(int i=0;i<characters.size();i++)
        	cout<<arr1[i]<<" ";
        cout<<endl;
        int flag=false;
       for(int i=0;i<characters.size();i++)
       {
       	if(arr1[i]=characters[i])
       	{ flag=true;
          break;
       	}
       }
       if(flag=true)
       	cout<<"Yes"<<endl;
       else
       	cout<<"No"<<endl;
       while(!characters.empty())
       	characters.pop_back();
	}
	return 0;
}