import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String> l=new ArrayList<>();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='.'||c=='!'||c=='?'||c==','||c=='_'||c=='\''||c=='@'||c==' '){
                if(s1.length()==0){
                    continue;
                }
                l.add(s1.toString());
                s1=new StringBuilder();
            }
            else{
                s1.append(c);
            }
        }
        if(s1.length()!=0){
            l.add(s1.toString());
        }
        System.out.println(l.size());
        for(int i=0;i<l.size();i++){

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna