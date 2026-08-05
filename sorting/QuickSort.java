import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,-1,0,-10,8,8,3,-5,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int pIdx=partition(arr,s,e);
        sort(arr,s,pIdx-1);
        sort(arr,pIdx+1,e);
    }
    static int partition(int[] arr,int s,int e){
        int pivot=arr[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<=pivot){
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        i++;
        arr[e]=arr[i];
        arr[i]=pivot;
        return i;
    }
}
