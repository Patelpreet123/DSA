#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        if(n%3==0){
            cout<<0<<endl;
        }
        else{
            int x=n/5+1;
            if((n+1)%3==0||(5*x)%3==0){
                cout<<1<<endl;
            }
            else{
                cout<<2<<endl;
            }
        }
    }
}
