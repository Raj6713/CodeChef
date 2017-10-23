#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int testCases,building1,building2,moves;
	cin>>testCases;
	while(testCases--)
	{
		cin>>building1>>building2;
		if(building1==building2)
			moves=0;
         else
         {
         	moves=abs(building1-building2);
         }
         cout<<moves<<endl;
	}
	return 0;
}