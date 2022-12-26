import java.util.*;
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        int c = 0;
        while(c < arr.length - 1){
            for(int i=0; i<arr.length - c - 1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            c++;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        bubbleSort(arr);

        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
