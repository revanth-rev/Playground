#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t1=0,t2=1,t3,i,num;
  cin>>num;
  for(i=2;i<num;i++){
    t3=t1+t2;
    t1=t2;
    t2=t3;
  }
  cout<<t3;
}