//This program will show the total charges for the use and show the total charge
#include<iostream>
using namespace std;
#include<climits>
int main()
{
	int testCases,instance,freeminute;
	long int totalCharge;
	cin>>testCases;
	while(testCases--)
	{
		totalCharge=0;
		cin>>instance>>freeminute;
		int minute[instance],charge[instance];
		for(int i=0;i<instance;i++)
		{
			cin>>minute[i]>>charge[i];
		}

		for(int i=0;i<instance;i++)
		{
			if(freeminute>0)
			{	
				int k;
				k=minute[i];
				freeminute-=k;
				if(freeminute<minute[i])
					minute[i]-=freeminute;
				else
				minute[i]=minute[i]-k;
            }
			else
				break;

		}
		for(int i=0;i<instance;i++)
			cout<<minute[i]<<" "<<charge[i]<<endl;
      // cout<<totalCharge<<endl;
	}
	return 0;
}