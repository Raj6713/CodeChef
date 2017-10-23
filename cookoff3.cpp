#include<iostream>
using namespace std;
#include<set>
#include<string>
inline int checkString(string,int,int);
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string input;
	int testCases,count;
	cin>>testCases;
	while(testCases--)
	{
       cin>>input;
       for(int i=0;i<input.length();i++)
       {
       	for(int j=i;j<input.length();j++)
       	{
       		count+=checkString(input,i,j);
       	}
       }
      cout<<count<<endl;
	}
	return 0;
}

inline int checkString(string a,int lower,int higher)
{
	string newOne;
	//newOne=a.substr(lower,higher);
	bool firstCondition,secondCondition;
	firstCondition=secondCondition=false;
	if(newOne.length()==2 && (newOne[lower]==newOne[higher]))
		firstCondition=true;
	if(firstCondition) return 1;

     set<char> sp;
	if(newOne.length()>2 && (newOne[lower]==newOne[higher]) )
	{
		for(int i=lower+1;i<higher;i++)
			sp.insert(newOne[i]);
	}
	if(sp.size()==1)
		secondCondition=true;
	sp.clear();
	if (firstCondition || secondCondition)
		return 1;
    else
    	return 0;
}

