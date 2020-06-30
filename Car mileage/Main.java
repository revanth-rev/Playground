#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int petrol,dis,res;
  float mil;
  cin>>mil>>petrol>>dis;
  res=mil*petrol;
  if(res>=dis){
    cout<<"Can reach";
  }
  else
    cout<<"Cannot reach";
}