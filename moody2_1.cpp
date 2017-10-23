#include<iostream>
using namespace std;
#include<cstdlib>
#include<map>
int main()
{

	long int stockPrice,lastOccurence;
	int queries,days,query;
	map<long int,long int> myPrice;
	cin>>days;
	for(int i=1;i<days+1;i++)
       {        
       	cin>>stockPrice;
       	myPrice[stockPrice]=i;
       }
     map<long int,long int>::iterator it;
     for(it=myPrice.begin();it!=myPrice.end();it++)
     	cout<<it->first<< " : "<<it->second<<endl;
      
      cin>>queries;
      for(int i=0;i<queries;i++)
      {
      	cin>>query;
        if(myPrice[query]>0)
        	cout<<myPrice[query]<<endl;
        else
        	cout<<-1<<endl;
       }
       myPrice.clear();
   return 0;
}