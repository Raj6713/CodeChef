#include<iostream>
using namespace std;
#include<string>
string permutation(int [],int);
int main()
{

   int size;
	while(cin>>size && size!=0)
	{
		int arr[size];
		for(int i=0;i<size;i++)
			cin>>arr[i];
       cout<<permutation(arr,size)<<endl;
	}
	return 0;
}

string permutation(int arr[],int size)
{
	int p[size];
	int value,position;
	for(int i=0;i<size;i++)
	{
		
		p[arr[i]-1]=i+1;
	}
	//for(int i=0;i<size;i++)
	//cout<<arr[i]<<" "<<p[i]<<endl;
	bool flag=false;
    string s1,s2;
    s1=s2="";
    for(int i=0;i<size;i++)
    {
    	s1+=to_string(arr[i]);
         s2+=to_string(p[i]);
    }
    	if(s1==s2)
    		return "ambiguous";
    	else
    		return "not ambiguous";

}