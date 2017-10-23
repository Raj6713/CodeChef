//This program will grade the steel and will show output on the screen.
#include<iostream>
using namespace std;
#define HARD 50
#define CAR 0.7
#define TEN 5600
int main()
{
	int testCases,hardness,tensile;
	float carbon;
	cin>>testCases;
	while(testCases--)
	{
		cin>>hardness>>carbon>>tensile;
        if((hardness>HARD) && (carbon<CAR) && (tensile>TEN))
        	cout<<"10"<<endl;
        else if((hardness>HARD) && (carbon<CAR) && (!tensile>TEN))
        	cout<<"9"<<endl;
        else if((!hardness>HARD) && (carbon<CAR) && (tensile>TEN))
        	cout<<"8"<<endl;
       else if((hardness>HARD) && (!carbon<CAR) && (tensile>TEN))
        	cout<<"7"<<endl;
       else if((!hardness>HARD) && (!carbon<CAR) && (tensile>TEN || !hardness>HARD && carbon<CAR && !tensile>TEN  || hardness>HARD && !carbon<CAR && !tensile>TEN)
           cout<<"6";
       else if(!hardness>HARD && !carbon<CAR && !tensile>TEN)
       	cout<<"5"<<endl;
	}
	return 0;
}