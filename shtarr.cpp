//Codechef problem
#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>
int main()
{
	int testCases,arrSize,queries;
	char symbol;
	cin>>testCases;
	while(testCases--)
	{
       cin>>arrSize>>queries;
       int height[arrSize+1];
       for(int i=1;i<arrSize+1;i++)
       	cin>>height[i];

        cin>>symbol;
        if(symbol=='?')
        {
          int ii,l,r,raysNum;
          cin>>ii>>l>>r;
          

        }
        if(symbol=='+')
        {
         cin>>a>>b;
         height[a]+=b;
        }


	}
	return 0;
}