import java.util.*;
public class SringSplit {
    public static void main(String[] args) {
        String s = "Durga Sofware Solution";
        String[] s1 = s.split("\\s");
        for(String x :s1){
            System.out.println(x);
        }        
    }
}

