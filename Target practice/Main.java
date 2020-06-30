#include<iostream>
using namespace std;
int main()
{
  //Type your code here.,
  int tar,sco,att=0,sum=0;
  cin>>tar;
  while(sum<tar){
    cin>>sco;
    sum+=sco;
    att++;
  }
  cout<<"The number of turns is "<<att<<"\n";
}