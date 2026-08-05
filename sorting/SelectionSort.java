import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,-1,0,-10,8,8,3,-5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int m=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[m];
            arr[m]=t;
        }
    }
}
