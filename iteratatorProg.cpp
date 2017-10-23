#include<iostream>
using namespace std;
typedef const int* IteratorType;
IteratorType find(IteratorType begin,IteratorType end,const int& value);
int main()
{
	const int count=100;
	int aContainer[count];
	IteratorType begin =aContainer;
	IteratorType end=aContainer+count;
	for(int i=0;i<count;i++)
		aContainer[i]=2*i;
	int number=0;
	while(number!=-1)
	{
		cout<<"Enter required number: -1 to exit"<<endl;
		cin>>number;
		if(number!=-1)
		{
			IteratorType position=find(begin,end,number);
		
		if(position!=end)
			cout<<"The position is given by: "<<(position-begin)<<endl;
		else
			cout<<"Not found"<<endl;
	  }
	}
}

IteratorType find(IteratorType begin,IteratorType end,const int& value)
{
	while(begin!=end && *begin!=value)
		++begin;
		return begin;
}
