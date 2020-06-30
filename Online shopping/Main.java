#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int d1=(a*b)/100;
  int t1=a-d1+c;
  int d2=(d*e)/100;
  int t2=d-d2+f;
  int d3=(g*h)/100;
  int t3=g-d3+i;
  cout<<"In Flipkart Rs."<<t1<<"\n";
  cout<<"In Snapdeal Rs."<<t2<<"\n";
  cout<<"In Amazon Rs."<<t3<<"\n";
  if(t1<=t2 && t1<=t3){
    cout<<"He will prefer Flipkart\n";
  }
  else if(t2<=t3 && t2<=t1){
    cout<<"He will prefer Snapdeal\n";
  }
  else{ 
    if(t1==t2){
    	if(t3<t1){
      		cout<<"He will prefer Amazon\n";
   		}
    	else{
          if(d1<d2){
            cout<<"He will prefer Flipcart\n";
          }
          else{
            cout<<"He will prefer Snapdeal\n";
          }
    	}
    }
  }
    
}