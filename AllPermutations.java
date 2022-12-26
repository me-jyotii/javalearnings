import java.util.Scanner;

public class AllPermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input row :: ");
        int row = scn.nextInt();

        int[] arr = new int[row];
        for(int i=0; i<row; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println();

        for(int i=0; i<row; i++){
            for(int j=i; j<row; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }     
    }
}
