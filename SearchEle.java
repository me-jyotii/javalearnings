import java.util.Scanner;

public class SearchEle {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input rol and search element :: ");
        int row = scn.nextInt();
        int target = scn.nextInt();
        boolean f = false;
        int occ = 0;

        int[] arr = new int[row];
        for(int i=0; i<row; i++){
            arr[i] = scn.nextInt();
            if(arr[i] == target){
                f=true;
                occ++;
            }
        }

        System.out.println();

        if(f)
            System.out.println("Element found"+" occc = "+ occ);
        else
            System.out.println("Not found");        
    }    
}
