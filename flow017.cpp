//Find second largest;
#include<iostream>
using namespace std;
#include<set>
#include<algorithm>
int main()
{
	int testCases,num1,num2,num3;
	cin>>testCases;
	while(testCases--)
	{
		
	set<int> values;
    set<int>::iterator it;
      cin>>num1>>num2>>num3;
      values.insert(num1);
      values.insert(num2);
      values.insert(num3);
      it=values.end();
      it--;
      it--;
      cout<<*it<<endl;
	}
}