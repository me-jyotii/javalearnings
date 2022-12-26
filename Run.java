// overloading of run method
class MyThread extends Thread{
    
    // public void run(){
    //     System.out.println("no-arg run");
    //     // run(5);
    // }

    public void run(int n){
        System.out.println("int-arg run");
    }

    public void run(float f){
        System.out.println("float-arg run");
    }
}
public class Run {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        // t.run(4.5f);
        System.out.println("main method");
    }
}
