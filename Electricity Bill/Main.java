#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units;
  cin>>units;
  if(units<=200){
    cout<<"Rs."<<int(0.5*units);
  }
  else if(units<=400){
    cout<<"Rs."<<(0.65*units)+100;
  }
  else if(units<=600){
    cout<<"Rs."<<(0.80*units)+200;
  }
  else{
    cout<<"Rs."<<(1.25*units)+425;
  }
}