import java.util.*;
public class StringTokenization {
    public static void main(String[] args) {
        // StringTokenizer st = new StringTokenizer("Durga software solution");
        StringTokenizer st = new StringTokenizer("Durga software solution","a");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }        
    }    
}
