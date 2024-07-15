import java.util.*;
class LongestConsecutive{
    public static int LongestConsecutive(int arr[]){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int j=arr[i];
                while(set.contains(j)){
                    max=Math.max(max,j-arr[i]+1);
                    j++;
                }
            }

        
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={100,4,200,1,3,2};
        System.out.println(LongestConsecutive(arr));

    }
}