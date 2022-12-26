import java.util.*;
public class selectionSort {

    public static int[] SelectionSort(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        SelectionSort(arr);

        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");

    } 
}
