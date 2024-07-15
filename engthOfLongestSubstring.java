import java.util.*;
public class engthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        int n=s.length();
        int maxlength=0;
        Set<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<=n;right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlength=Math.max(maxlength,right-left+1);
            }else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        return maxlength;

    }
    public static void main(String[] args){
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
    
}
