import java.util.*;
public class containsDuplicates {
    public static boolean containsDuplicates(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //Optimised Version
    public static boolean containsDuplicates1(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }
    
}
