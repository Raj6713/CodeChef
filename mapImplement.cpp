//This program will implement map and will show it on the screen.
#include<iostream>
using namespace std;
#include<map>
#include<string>
int main()
{
	bool flag=false;
	char ch;
	string name,phoneNumber;
	map<string,string> phonebook;
	map<string,string>::iterator it;
	do
	{
		cout<<"Enter name:"<<endl;
		getline(cin,name);
		cout<<"Enter Phone number"<<endl;
		cin>>phoneNumber;
		phonebook.insert(pair<string,string>(name,phoneNumber));
		cout<<"Want to proceed again:"<<endl;
		cin>>ch;
		if(ch=='Y' || ch=='y')
			flag=true;
		else
			flag=false;
	}while(flag);

	cout<<"Print the whole directory"<<endl;
	for(it=phonebook.begin();it!=phonebook.end();it++)
		cout<<(*it).first<<" : "<<(*it).second<<endl;

}