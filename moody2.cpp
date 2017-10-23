//Stock price buying facility
#include<iostream>
using namespace std;
int main()
{
	int days,queries,stockprice,lastposition;
	cin>>days;
	int price[days+1]={0};
	for(int i=1;i<days+1;i++)
		cin>>price[i];
	//query taken by user;
	cin>>queries;

     
	while(queries--)
	{
         lastposition=-1;
		cin>>stockprice;
		for(int i=days;i>0;i--)
		{
			if(price[i]==stockprice)
				{lastposition=i;break;}
		}
		cout<<lastposition<<endl;
		
	}
	return 0;
}