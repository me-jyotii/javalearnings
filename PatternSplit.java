import java.util.regex.*;
public class PatternSplit {
    
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("\\s");
        // Pattern p = Pattern.compile("\\.");
        Pattern p = Pattern.compile("a");
        String[] s = p.split("durga.software.solution");
        for(String s1 : s){
            System.out.println(s1);
        }        
    }
}
