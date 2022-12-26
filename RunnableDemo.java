import java.lang.*;
class RunnableThread implements Runnable{
    public void run(){
        System.out.println("thread using runnable");
    }
}
public class RunnableDemo {
    public static void main(String[] args){
        RunnableThread r = new RunnableThread();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<7; i++)
            System.out.println("main");
    }    
}
