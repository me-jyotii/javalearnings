public class Manager { 
    private int y = 8; 
    public static void main(String[] args) { 
        new Manager().go();
    } 
    void go() { 
        int x = 7;
        TCPIP ip = new TCPIP();
        class TCPIP {
            void doit() {
                System.out.println(y + x);
            }
        }
        ip.doit();
    }
} 
