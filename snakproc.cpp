#include<iostream>
using namespace std;
#include<string>
bool snakeProcessor(string);
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int testCases,size;
	string process;
	cin>>testCases;
	while(testCases--)
	{
		cin>>size;
		cin>>process;
		bool result=snakeProcessor(process);
        if(result)
        	cout<<"valid"<<endl;
        else
        	cout<<"invalid"<<endl;
	}
	return 0;
}

bool snakeProcessor(string p)
{
	char prev;
	string message="";
	for(int i=0;i<p.length();i++)
	{
		if(p[i]=='.')
			continue;
		else
			message+=p[i];
	}

	if(message=="")
		return true;
	else
	{
		int H,T;
		H=T=0;
		if(message.length()%2!=0)
			return false;
		for(int i=0;i<message.length();i++)
		{
		     if()
		}

        
	}
}
