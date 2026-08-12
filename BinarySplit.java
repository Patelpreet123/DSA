import java.util.*;
class BinarySplit{
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char[] x1=new char[n];
            int[] x2=new int[n];
            int c=0,k=1;
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    k++;
                }
                else{
                    x1[c]=s.charAt(i-1);
                    x2[c]=k;
                    k=1;
                    c++;
                }
            }
            x1[c]=s.charAt(n-1);
            x2[c]=k;
            c++;
            int m1=-1,m2=Integer.MAX_VALUE;
            for(int i=0;i<c-1;i++){
                if(x1[i]=='0'&&x1[i+1]=='1'){
                    int y1=x2[i];
                    int y2=x2[i+1];
                    if(y1>m1){
                        m1=y1;
                        m2=y2;
                    }
                    else if(y1==m1){
                        m2=Math.min(m2,y2);
                    }
                }
            }
            if(m1==-1){
                System.out.println(s);
            }
            else{
                for(int i=0;i<m1;i++){
                    System.out.print(0);
                }
                for(int i=0;i<m2;i++){
                    System.out.print(1);
                }
                System.out.println();
            }
        }
	  }
}
