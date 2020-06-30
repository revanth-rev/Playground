#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float t;
  float t1=10.15,t2=13.30,t3=18.00,t4=22.00;
  cin>>a>>t;
  if(a<=13 && t==t2 || t==t4)
    cout<<"$2.00";
  else if(a<=13 && t==t1 || t==t3)
    cout<<"$4.00";
  if(a>13 && t==t2 || t==t4)
    cout<<"$5.00";
  else if(a>13 && t==t1 || t==t3)
    cout<<"$8.00";
}