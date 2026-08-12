#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int s=0,c=0;
        for(int i=0;i<n;i++){
            int x;
            cin>>x;
            if(x%2!=0){
                c++;
            }
            s=s+x;
        }
        if(s%2==0){
            cout<<s-(c/2)<<endl;
        }
        else{
            cout<<c/2<<endl;
        }
    }
}
