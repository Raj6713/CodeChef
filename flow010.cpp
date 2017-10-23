//Chef tries to classify ships
#include<iostream>
using namespace std;
int main()
{
	int testCases;
	char ch;
	cin>>testCases;
	while(testCases--)
	{
		cin>>ch;
		if(ch=='B' || ch=='b')
			cout<<"BattleShip"<<endl;
		
		if(ch=='C' || ch=='c')
			cout<<"Cruiser"<<endl;

		if(ch=='D' || ch=='d')
			cout<<"Destroyer"<<endl;
		
		if(ch=='F' || ch=='f')
		    cout<<"Frigate"<<endl;	
	}
	return 0;
}