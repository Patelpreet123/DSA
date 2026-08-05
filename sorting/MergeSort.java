import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,-1,0,-10,8,8,3,-5,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int m=l+(r-l)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    static void merge(int[] arr,int l,int m,int r){
        int[] t=new int[r-l+1];
        int x=0;
        int i=l;
        int j=m+1;
        while(i<=m && j<=r){
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
