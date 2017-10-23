//This set will implement the set operations
#include<iostream>
using namespace std;
#include<set>
#include<string>
int main()
{
	char ch;
	set<char> vowelVal;
	set<char> vowel;
	set<char>::iterator it;
	set <char> consonant;
	
	vowelVal.insert('a');
	vowelVal.insert('e');
	vowelVal.insert('i');
	vowelVal.insert('o');
	vowelVal.insert('u');

	string input;
	cout<<"Enter string"<<endl;
	getline(cin,input);

	for(int i=0;i<input.length();i++)
	{
		ch=input[i];
		ch=tolower(ch);
		if(ch==' ')
			continue;
		else
		{
			it=vowelVal.find(ch);
			if(it!=vowelVal.end())
				vowel.insert(ch);
			else
				consonant.insert(ch);
		}

	}
   cout<<"Vowels present in string:"<<endl;
  for(it=vowel.begin();it!=vowel.end();it++)
  	cout<<*it<<" ";
  cout<<endl;

  cout<<"Consonant present in string:"<<endl;
  for(it=consonant.begin();it!=consonant.end();it++)
  	cout<<*it<<" ";
  cout<<endl;

  return 0;

}