import java.util.*;
public class MaximumTillIndex {
    
    public static int[] maxTillIdx(int[] arr){
        int maxm = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxm = Math.max(maxm,arr[i]);
            arr[i] = maxm;
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        maxTillIdx(arr);

        for(int i=0; i<n; i++)
            System.err.print(arr[i] +" ");

    }
}
