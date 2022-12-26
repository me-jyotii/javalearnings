//package LinkedList;
import java.lang.*;
public class mergeArray {
    public static void main(String[] args) {
        int arr1[] = {2,6,7,9,30};
        int arr2[] = {1,3,8,15,40,50,55};

        int s1 = arr1.length;
        int s2 = arr2.length;
        // int g = Math.max(s1, s2);
        // int s = Math.min(s1, s2);
        
        int newArr[] = new int[s1+s2];

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        while(cnt1 < s1 && cnt2 < s2){
            if(arr1[cnt1] < arr2[cnt2]){
                newArr[cnt3] = arr1[cnt1];
                cnt1++;
                cnt3++;

            }
            else if(arr1[cnt1] > arr2[cnt2]){
                newArr[cnt3] = arr2[cnt2];
                cnt2++;
                cnt3++;
            }
        }
        
        while(cnt1 < s1){
            newArr[cnt3] = arr1[cnt1];
            cnt1++;
            cnt3++;
        }

        while(cnt2<s2){
            newArr[cnt3] = arr2[cnt2];
            cnt2++;
            cnt3++;
        }

        for(int i=0; i<(s1+s2); i++){
            System.out.print(newArr[i]+" ");
        }       
    }
}
