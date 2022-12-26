import java.util.regex.*;
public class RegularEx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abbababba");
        int c = 0;
        while(m.find()){
            c++;
            System.out.println(m.start()+"..."+m.end()+"  "+m.group());
        }
        System.out.println("count = "+c);
        
    }
    
}
