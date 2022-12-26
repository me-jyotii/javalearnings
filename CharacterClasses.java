import java.util.regex.*;
public class CharacterClasses {
    public static void main(String[] args) {
        // String s = "a3b#K@9z";
        // String s = "a3b# K@9z";
        // String s = "abbaabbbaaa";
        
        // ------------------Character classes-----------------

        // Pattern p = Pattern.compile("[abc]");
        // Pattern p = Pattern.compile("[^abc]");
        // Pattern p = Pattern.compile("[a-z]");
        // Pattern p = Pattern.compile("[A-Z]");
        // Pattern p = Pattern.compile("[0-9]");
        // Pattern p = Pattern.compile("[a-zA-Z]");
        // Pattern p = Pattern.compile("[a-z0-9A-Z]");
        // Pattern p = Pattern.compile("[^A-Z0-9a-z]");

        // ------------------Predefined Character classes-----------------

        // Pattern p = Pattern.compile("\\s");
        // Pattern p = Pattern.compile("\\S");
        // Pattern p = Pattern.compile("\\d");
        // Pattern p = Pattern.compile("\\D");
        // Pattern p = Pattern.compile("\\w");
        // Pattern p = Pattern.compile("\\W");
        // Pattern p = Pattern.compile(".");

        // ------------------quantifiers-----------------

        String s = "abbaabbbaaa";
        // Pattern p = Pattern.compile("a");
        // Pattern p = Pattern.compile("a+");
        // Pattern p = Pattern.compile("a*");
        Pattern p = Pattern.compile("a?");
        
        Matcher m = p.matcher(s);
        
        while(m.find()){
            System.out.println(m.start()+"..."+m.end()+"..."+m.group());
        }
    }
    
}
