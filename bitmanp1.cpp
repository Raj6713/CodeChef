//This program will show bit manipulation and show correspondin output
#include<iostream>
using namespace std;
#include<cstdlib>
#include<string>
inline void binaryPrinter(int num);
int main()
{
	unsigned int num1,num2;
	cout<<"Enter num1: ";
	cin>>num1;
	cout<<"Enter num2: ";
	cin>>num2;
	binaryPrinter(num1);
	binaryPrinter(num2);
	//cout<<~num1;
	//binaryPrinter(~num1);
	//binaryPrinter(~num2);
	binaryPrinter(num1 | num2);
	binaryPrinter(num1 & num2);
	binaryPrinter(num1^num2);
	binaryPrinter(num1<<1);
	binaryPrinter(num2<<1);
	return 0;
}

inline void binaryPrinter(int num)
{
	int a;
    string message="";
    cout<<num<<endl;
    while(num>0)
    {
    	a=num%2;
    	num=num/2;
    	message+=to_string(a);
    }

    for(int i=message.length()-1;i>=0;i--)
    	cout<<message[i];

    cout<<endl;
}
