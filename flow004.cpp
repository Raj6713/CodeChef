#include<iostream>
using namespace std;
#include<string>
int value(int);
int main()
{
	int testCases;
	cin>>testCases;
    while(testCases--)
    {
    	int number;
    	cin>>number;
    	cout<<value(number)<<endl;
    }
    return 0;
}

int value(int a)
{
	int sum=0;
	string mess;
	mess=to_string(a);
	sum=(mess[0]-'0')+(mess[mess.length()-1]-'0');
	return sum;
}