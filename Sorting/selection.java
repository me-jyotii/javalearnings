package Sorting;

public class selection {
    public static void main(String ar[]) {
        int arr[] = {4,5,1,2,3};
    
        //selection sort
        for(int i=0; i<arr.length; i++){
            int max = arr[i];
            for(int j=i+1; j<arr.length -i - 1; j++){
                if(arr[i] > arr[j])
                    max = arr[j];
            }
            arr[arr.length -i -1] = max;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }     
    }     
}
