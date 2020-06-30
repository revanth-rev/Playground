#include<iostream>
using namespace std;
int main()
{
  int n,a=11,i,num;
  cin>>n;
  for(i=0;i<n;i++){
    num=a*a;
    cout<<num<<" ";
    a=a+4;
  }
}