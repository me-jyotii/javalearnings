class test {
    static void show(){
        System.out.println("Show method in Test class");
        }
}
public class Q2 extends test {
    static void show(){
        System.out.println("Show method in Q2 class");
    }

    public static void main(String[] args) {
        test t = new test();
        t.show();
        Q2 q = new Q2();
        q.show();
        t=q;
        t.show();
        q.show();    
    }
}

