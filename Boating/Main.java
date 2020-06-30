#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int max,a,c,w,w1,w2;
  cin>>max;
  cin>>a;
  cin>>c;
  w1=a*75;
  w2=c*30;
  w=w1+w2;
  if(w<=max){
    cout<<"Boat is stable";
  }
  else{
    cout<<"Boat will drow";
  }
}