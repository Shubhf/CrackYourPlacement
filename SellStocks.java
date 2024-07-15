import java.util.*;
public class SellStocks{
    public static int Profit(int[] arr){
        int BuyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(BuyPrice<arr[i]){
                int profit=arr[i]-BuyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                BuyPrice=arr[i];
        }
        
    }
    return maxProfit;
}
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(Profit(prices));

    }
}
   

