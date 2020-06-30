#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b,c,d,e;
  cin>>a>>b;
  c=a*b;
  d=(b*50)/100;
  if(a<=2){
    cout<<c-d;
  }
  else if(a==3){
    cout<<2*b;
  }
  else
    cout<<"Number of items is more";
}