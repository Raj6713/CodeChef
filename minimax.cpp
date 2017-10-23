#include<iostream>
using namespace std;
#include<vector>
#include<climits>
inline vector<int> minimum(int **,int);
inline vector<int> maximum(int **,int);
inline int findSol(vector<int>,vector<int>);
int main()
{
	int size;
	cin>>size;
	int **arr=(int **)malloc(size*sizeof(int *));
	for(int i=0;i<size;i++)
		arr[i]=(int *)malloc(size*sizeof(int));
		
	vector<int> mini,maxi;
	vector<int>::iterator it;
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
			cin>>*(*(arr+i)+j);
	}
	mini=minimum(arr,size);
	maxi=maximum(arr,size);
	cout<<findSol(mini,maxi)<<endl;
    return 0;
}

inline int findSol(vector<int> a,vector<int> b)
{
	int min,max;
	min=INT_MAX;
	max=INT_MIN;
	vector<int>::iterator it;
	for(it=a.begin();it!=a.end();it++)
	{
		if(*it>max)max=*it;
	}

	for(it=b.begin();it!=b.end();it++)
	{
		if(*it<min)min=*it;
	}

	cout<<max<<" "<<min<<endl;
    return 0;
}


inline vector<int> minimum(int **a,int size)
{
	int min;

	vector<int> p;
	p.clear();
	for(int i=0;i<size;i++)
	{
		min=INT_MAX;
		for(int j=0;j<size;j++)
		{
			if(a[i][j]<min)min=a[i][j];
		}
		p.push_back(min);
	}
	return p;
}

inline vector<int> maximum(int **a,int size)
{

	int max;
	vector<int> p;
	p.clear();
	for(int j=0;j<size;j++)
	{
		max=INT_MIN;
		for(int i=0;i<size;i++)
		{
			if(a[i][j]>max)max=a[i][j];
		}
		p.push_back(max);
	}
	return p;
}
