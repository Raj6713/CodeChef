#include<iostream>
using namespace std;
#include<vector>
int main()
{
	int testCases,size;
	cin>>testCases;
	vector<int> minp;
	vector<int>::iterator it;
	while(testCases--)
	{
		cin>>size;
		if(size%2==0)
		{
			for(int i=1;i<=size/2;i++)
				{minp.push_back(2*i); minp.push_back(2*i-1);}
		}
		else
		{
			int i;
			for(i=1;i<=size/2-1;i++)
				{minp.push_back(2*i); minp.push_back(2*i-1);}
			minp.push_back(2*i); minp.push_back(2*i+1);
			minp.push_back(2*i-1);

		}
		for(it=minp.begin();it!=minp.end();it++)
			cout<<*it<<" ";
		cout<<endl;
		minp.clear();
	}
	return 0;
}
