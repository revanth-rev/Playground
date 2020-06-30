#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,n,sum=0;
  cin>>num;
  n=num;
  while(num>0){
    int rem=num%10;
    sum+=rem;
    num/=10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
}