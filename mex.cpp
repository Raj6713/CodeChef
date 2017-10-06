//This program will find the mex value for the given set and show output
#include<iostream>
using namespace std;
#include<climits>
#include<cstdlib>
int main()
{
	bool flag;
	register int testCases,setSize,valueInput,i,max;
	cin>>testCases;
	while(testCases--)
	{
		max=INT_MIN;
		cin>>setSize>>valueInput;
		int arr[setSize];
        for(int i=0;i<setSize;i++)
        {
        	cin>>arr[i];
        	if(arr[i]>max)
        		max=arr[i];
        }
        int arr1[max+1];
        for(int i=0;i<max+1;i++)
        	arr1[i]=-1;
        for(int i=0;i<setSize;i++)
        {
        	++arr1[arr[i]];
        }
         
         for(int i=0;i<max+1;i++)
         {
         	if(valueInput<=0)
         		break;
            if(arr1[i]==-1)
         	{
         		arr1[i]=0;
         		valueInput--;
         	}
         }
         	

     int p;
     flag =false;
     for(int i=0;i<max+1;i++)
     {
     	if(arr1[i]==-1)
     		{
     		flag=true;
             p=i;
     		break;
     	} 	
     }
     if(flag==true)
     cout<<p<<endl;
     else
     	cout<<max+1+valueInput<<endl;   
	}
  return 0;
}