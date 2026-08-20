#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        long long n,h;
        cin>>n>>h;
        long long a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        long long s=1,e=h;
        long long ans=-1;
        while(s<=e){
            long long m=s+(e-s)/2;
            long long c=0;
            for(int i=1;i<n;i++){
                int x=a[i]-a[i-1];
                if(x<m){
                    c+=x;
                }
                else{
                    c+=m;
                }
            }
            c+=m;
            if(c>=h){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        cout<<ans<<endl;
    }
}
