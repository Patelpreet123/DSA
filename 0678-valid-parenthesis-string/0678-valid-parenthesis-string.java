class Solution {
    public boolean checkValidString(String s) {
        Boolean[][] dp=new Boolean[s.length()][s.length()+1];
        return x(s,0,0,dp);
    }
    boolean x(String s,int i,int x,Boolean[][] dp){
        if(x<0){
            return false;
        }
        if(i==s.length()){
            if(x==0){
                return true;
            }
            return false;
        }
        if(dp[i][x]!=null){
            return dp[i][x];
        }
        boolean y=false;
        if(s.charAt(i)=='('){
            y=x(s,i+1,x+1,dp);
        }
        else if(s.charAt(i)==')'){
            y=x(s,i+1,x-1,dp);
        }
        else{
            y=x(s,i+1,x+1,dp)||x(s,i+1,x-1,dp)||x(s,i+1,x,dp);
        }
        dp[i][x]=y;
        return y;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna