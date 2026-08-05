class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int m=l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    void merge(int[] arr,int l,int m,int r){
        int[] t=new int[r-l+1];
        int i=l,j=m+1;
        int x=0;
        while(i<=m&&j<=r){
            if(arr[i]<=arr[j]){
                t[x]=arr[i];
                i++;
            }
            else{
                t[x]=arr[j];
                j++;
            }
            x++;
        }
        while(i<=m){
            t[x]=arr[i];
            i++;
            x++;
        }
        while(j<=r){
            t[x]=arr[j];
            j++;
            x++;
        }
        x=0;
        for(i=l;i<=r;i++){
            arr[i]=t[x];
            x++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna