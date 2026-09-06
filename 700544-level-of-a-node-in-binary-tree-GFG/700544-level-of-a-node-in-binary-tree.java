class Solution {
    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        // Write your code here
        return f(node,data,1);
    }
    int f(Node n,int data,int x){
        if(n==null){
            return 0;
        }
       if(n.data==data){
           return x;
       }
       int l=f(n.left,data,x+1);
       if(l!=0){
           return l;
       }
       return f(n.right,data,x+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna