#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int i,fact=1,num;
  cin>>num;
  for(i=1;i<=num;i++){
    fact=fact*i;
  }
  cout<<fact<<endl;
}