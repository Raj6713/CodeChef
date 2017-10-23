#include<iostream>
#include<set>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
	
	int testCases,n;
	cin>>testCases;
	string input,s1;	
	set<int>::iterator it;
	set<int> values;
	while(testCases--)
	{
		
		s1="";
        getline(cin,input);
        for(int i=0;i<input.length();i++)
        {
        	
        	if(input[i]==' ')
        	{
        		values.insert(stoi(s1));
        		s1="";
        	}
        	else
        	{
        		s1+=input[i];
        	}
        }
	     
		cout<<"values in the set\n";
		for(it=values.begin();it!=values.end();it++)
			cout<<*it<<" ";
         cout<<endl;
         values.clear();
	}
	return 0;
}