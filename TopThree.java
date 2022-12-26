import java.util.Scanner;

public class TopThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input rol :: ");
        String val = scn.next();

        // int[] arr = new int[row];
        // for(int i=0; i<row; i++){
        //     arr[i] = scn.nextInt();
        // }

        System.out.println();

        // decimal to binary
        Integer str = Integer.valueOf(val, 8);
        System.out.print(str);
    } 
    
}
