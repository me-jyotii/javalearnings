// import java.lang.Integer;
// import java.lang.Boolean;

class Test1{
    static void show(){
        System.out.println("Show method in Test class");
        }
    }

public class Test extends Test1 {
    static void show(){
        System.out.println("Show method in Q2 class");
    } 
    public static void main(String[] args) {
        Test1 t new Test1();
        t.show();
        Q2 q new Q2();
        q.show();
        /*
        Boolean b1 = Boolean.valueOf("Yes");
        Boolean b2 = Boolean.valueOf("No");

        System.out.println(b1.equals(b2));
        

        Integer i = Integer.valueOf("1111",2);
        System.out.println(i); //15

        

        Boolean[] b = new Boolean[2];
    
        b[0] = new Boolean(Boolean.parseBoolean("true"));
        b[1] = new Boolean(null);

        System.out.println(b[0]+"..."+b[1]);

      

        String s1 = "123";
        String s2 = "TRUE";

        Integer i1 = Integer.parseInt((s1));
        Boolean b1 = Boolean.parseBoolean(s2);

        System.out.println(i1+"..."+b1);

        int i2 = Integer.valueOf(s1);
        Boolean b2 = Boolean.valueOf(s2);

        System.out.println(i2+"..."+b2);

        */

        
    }
}