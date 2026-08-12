#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n,m,x;
        cin>>n>>m>>x;
        int f=(x-1)/m+1;
        cout<<min(f,n-f+1)<<endl;
    }
}
