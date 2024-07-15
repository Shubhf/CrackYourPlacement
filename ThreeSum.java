import java.util.*;
public class ThreeSum{
    public static List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=nums.length-1;
                int sum=-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }else{
                        if(nums[low]+nums[high]<sum){
                            low++;
                        }else{
                            high--;
                        }
                    }
                }
            }
        }
        return res;
    }
    public static List<List<Integer>> ThreeSum1(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                    j++;
                    k--;

                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }

        }
        return res;
    }
    public static void main(String[] args){
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(ThreeSum(nums));

    }
    
}
