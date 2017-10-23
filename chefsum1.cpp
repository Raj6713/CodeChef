//This will work as fast method to solve the problem.
#include<iostream>
using namespace std;
inline void summer(long int *, int *,int );
int main()
{
    int testCases,arrSize;
    cin>>testCases;
    while(testCases--)
    {
       cin>>arrSize;
       int *arr=new int[arrSize];
       long int *cumArr=new long int[arrSize];
       for(int i=0;i<arrSize;i++)*(cumArr+i)=0;
       for(int i=0;i<arrSize;i++)
       	cin>>*(arr+i);
        summer(cumArr,arr,arrSize);
        for(int i=0;i<arrSize;i++)
        	cout<<*(cumArr+i)<<" ";
        cout<<endl;
    }
}

inline void summer(long int *a,int *b,int size)
{

	for(int i=0;i<size;i++)
	{
		*(a+i)+=*(b+i);
	}
}