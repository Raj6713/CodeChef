//virus tries to evade the world
//author: raj6713631@gmail.com
#include<iostream>
using namespace std;
#include<string>
#include<climits>
int main()
{    
	bool change;
	int testCases,count;
	char max;
	string virusCol,finalString;
	cin>>testCases;
	while(testCases--)
	{

        finalString="";
		count=0;
		cin>>virusCol;
		for(int i=0;i<virusCol.length();i++)
		{
			if(virusCol[i]>max)
				max=virusCol[i];
		}
		for(int i=0;i<virusCol.length();i++)
			finalString+=max;
		do
		{
			for(int i=0;i<virusCol.length();i++)
			{
               if((abs(virusCol[i]-max)<))


			}

		}while(virusCol!=finalString);



	}
	return 0;
}