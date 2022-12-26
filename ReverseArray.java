import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input rol :: ");
        int row = scn.nextInt();

        int[] arr = new int[row];
        for(int i=0; i<row; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println();

        for(int i=0; i<row/2; i++){
            int temp = arr[i];
            arr[i] = arr[row-i-1];
            arr[row-i-1] = temp;
        }

        for(int i=0; i<row; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
