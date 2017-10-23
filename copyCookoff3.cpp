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
       	for(int j=i+1;j<input.length();j++)
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
	bool firstCondition,secondCondition;
	firstCondition=secondCondition=false;
	if((higher-lower+1)==2 && (a[lower]==a[higher]))
		firstCondition=true;
	if(firstCondition) return 1;

    secondCondition=true;
	if((higher-lower+1)>2 && (a[lower]==a[higher]) )
	{
		char cp;
		cp=a[lower+1];

		for(int i=lower+2;i<higher;i++)
		{
			if(a[i]!=cp)
			{
			   //secondCondition=false;
              break;
             }
             
		}
		
	}

	if (firstCondition || secondCondition)
		return 1;
    else
    	return 0;
}

