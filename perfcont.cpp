//This problem will check whatever a competiiton is balanced or not
#include<iostream>
using namespace std;
#include<vector>
int main()
{
	register int testCases,problems,solvers,pushVal,hard,cake;
	cin>>testCases;
	while(testCases--)
	{
		hard=cake=0;
     cin>>problems>>solvers;
     for(int i=0;i<problems;i++)
     	{
     		cin>>pushVal;
       	if(pushVal>=solvers/2)
       		cake++;

       	if(pushVal<=solvers/10)
       		hard++;
       }
      if(cake==1 && hard==2)
      	cout<<"yes"<<endl;
      else
      	cout<<"no"<<endl;
	}
	return 0;
}