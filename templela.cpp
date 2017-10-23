#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
bool result(vector<int> v);
int main()
{
	int testCases,sizeOfTemple,value;
	cin>>testCases;
	while(testCases--)
	{
		vector<int> steps;
		vector<int>::iterator it;
		cin>>sizeOfTemple;
		for(int i=0;i<sizeOfTemple;i++)
        {
           	cin>>value;
           	steps.push_back(value);
        }
      
        bool k=result(steps);
        
        if(k==true)
        	cout<<"yes"<<endl;
        else
        	cout<<"no"<<endl;

        steps.clear();
	}
	return 0;
}

bool result(vector<int> v)
{
	
	if(v.size()%2==0)
		return false;
	else
	{
		vector<int>::iterator it;
		vector<int> p;
		for(int i=1;i<=v.size()/2;i++)
		   p.push_back(i);
        for(int k=v.size()/2+1;k>0;k--)
           p.push_back(k);

       /* for(it=p.begin();it!=p.end();it++)
        	cout<<*it<<" ";
        cout<<endl;

        for(it=v.begin();it!=v.end();it++)
        	cout<<*it<<" ";
        cout<<endl;*/
       bool b=equal(p.begin(),p.end(),v.begin());
       if(b) return true;
       else return false;
        p.clear();
	}
}