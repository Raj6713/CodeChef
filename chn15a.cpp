//Will solve minion problem related to gru since me and gru are gruesome
#include<iostream>
using namespace std;
#include<vector>
int main()
{
	int testCases,minions,values,pushValue,count;
	cin>>testCases;
	while(testCases--)
	{
		count=0;
		cin>>minions>>values;
		for(int i=0;i<minions;i++)
		{
			cin>>pushValue;
			pushValue+=values;
			if(pushValue%7==0)
				count++;
		}
		cout<<count<<"\n";
	}
	return 0;
}