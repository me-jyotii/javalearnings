class MyThread extends Thread{
    public void run(){
        // defining job
        for(int i=0; i<5; i++){
            System.out.println("jyoti");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] arg){
        MyThread t = new MyThread();
        t.start();
        for(int i=0; i<5; i++){
            System.out.println("RUSHH");
        }
    }
}
