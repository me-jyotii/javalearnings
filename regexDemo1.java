import java.util.regex.*;
public class regexDemo1 {
    public static void main(String[] rgs) {
        int count =0;
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abbbabbabab");
        while(m.find()){
            count++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }        
        System.out.println(count);
    }
}