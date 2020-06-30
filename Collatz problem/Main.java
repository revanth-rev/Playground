#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count;
  cin>>n;
  cout<<n<<"\n";
  while(n!=1){
    if(n%2==0){
      n=n/2;
      cout<<n<<"\n";
      count++;
    }
    else{
      n=n*3+1;
      cout<<n<<"\n";
      count++;
    }
  }
    cout<<count;
      
}