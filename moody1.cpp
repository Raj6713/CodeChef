//hackerrank problem
#include<iostream>
using namespace std;
#include<math.h>
int main()
{
	int id,transaction,persons,value,others,newtotal,anitapays;
	double avg,sum=0;
	
	cin>>transaction>>persons;
	int person[persons+1]={0};

	while(transaction--)
	{
		cin>>id>>value;
		person[id]+=value;
		sum+=value;
	}

    avg=sum/persons;

    others=(int)floor(avg);
    newtotal=(int)others*persons;
    anitapays=sum-newtotal;


    cout<<1<<" "<<(person[1]-others-anitapays)<<endl;
	for(int i=2;i<persons+1;i++)
		cout<<i<<" "<<(person[i]-others)<<endl;

	return 0;
}