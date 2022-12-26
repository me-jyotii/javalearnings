// overloading start method **not recommended
class MyThread extends Thread{
    public void start(){
        // super.start();
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }
}
public class Start {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        System.out.println("main method");
    }
}

// new/born --> ready/runnable --> running state --> dead