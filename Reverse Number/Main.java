#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,rev=0,rem;
  cin>>n;
  while(n!=0)
   {
    rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
   }
  cout<<rev<<endl;
	return 0;
}