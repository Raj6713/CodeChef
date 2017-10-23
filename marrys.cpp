#include<iostream>
using namespace std;
#include<algorithm>
#include<vector>
#include<climits>
int main()
{
	int testCases,dishes,val,size;
	long int max,sum;
	cin>>testCases;
	while(testCases--)
	{
		
		max=LONG_MIN;
		cin>>dishes;
		vector<int> a[dishes];
		vector<int>::iterator it;
		for(int i=0;i<dishes;i++)
		{
			cin>>size;
			for(int j=0;j<size;j++)
			{
				cin>>val;
				a[i].push_back(val);
			}
		}
     

       for(int i=0;i<dishes;i++)
       {
       	 for(int j=0;j<a[i].size();j++)
       	 {

           for(int p=0;p<dishes;p++)
           {
           	for(it=a[p].begin();it!=a[p].end();it++)
           		cout<<*it<<" ";
           	cout<<" | ";
           }
           
       	    

       		sum=0L;
       		for(int k=1;k<dishes;k++)
       		{
       			sum+=k*abs(a[i].front()-a[i-1].back());
       			cout<<a[i].front()<<"  "<<a[i-1].back()<<" ";
       		
       		}
       			if(sum>max)
       				max=sum;
       		cout<<"  "<<sum<<endl;

       		rotate(a[i].begin(),a[i].begin()+1,a[i].end());   
       	 } 
       
       }
       cout<<max<<endl;
       a[dishes].clear();
	}
     return 0;
}










