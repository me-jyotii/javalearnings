import java.util.*;

public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr){
        int maxm = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                maxm = Math.max(maxm,sum);
            }
        }
        return maxm;
    }  
    
    public static int kadans(int[] arr){
        int maxm = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum<0){
                sum = 0;
            }
            maxm = Math.max(maxm,sum);
        }
        return maxm;
    } 

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(kadans(arr));
    }
}
