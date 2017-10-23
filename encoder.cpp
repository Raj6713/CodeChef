//This will endcode array
#include<iostream>
using namespace std;
#include<cstdlib>
int decodeInteger(int,int);
void decodeArray(int *,int *, int n);
int encodeInteger(int ,int);
void encodeArray(int *,int *,int n);
int main()
{
	int size;
	cin>>size;
	int arr1[size],arr2[size];
	for(int i=0;i<size;i++)
	{
		arr1[i]=rand()%100;
		arr2[i]=rand()%100;
	}

	for(int i=0;i<size;i++)
		cout<<arr1[i]<<" ";
	cout<<endl;
	for(int i=0;i<size;i++)
		cout<<arr2[i]<<" ";
	cout<<endl;

	encodeArray(arr1,arr2,size);

	for(int i=0;i<size;i++)
		cout<<arr1[i]<<" ";
	cout<<endl;
	for(int i=0;i<size;i++)
		cout<<arr2[i]<<" ";
	cout<<endl;

	decodeArray(arr1,arr2,size);

	for(int i=0;i<size;i++)
		cout<<arr1[i]<<" ";
	cout<<endl;
	for(int i=0;i<size;i++)
		cout<<arr2[i]<<" ";
	cout<<endl;

	return 0;
}

void decodeArray(int *a,int *b,int n)
{
     for(int i=0;i<n;i++)
     	a[i]=decodeInteger(a[i],b[i]);
}

int decodeInteger(int x,int n)
{

}



void encodeArray(int *a,int *b,int n)
{
	for(int i=0;i<n;i++)
		a[i]=encodeInteger(a[i],b[i]);
}

int encodeInteger(int x,int n)
{
	n=n<<(1<<(1<<(1<<1)));
    x=x|n;
    return x;
}





