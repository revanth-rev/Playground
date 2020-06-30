#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,x,y;
  cin>>a>>b;
  if(a>b){
    x=1900+a;
    y=2000+b;
    cout<<y-x;
  }
  else{
    x=2000+a;
    y=2000+b;
    cout<<y-x;
  }
}