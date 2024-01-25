package threads;
class MyThread extends Thread{
    public void run(){
        //System.out.println("I'm a thread");
        Thread thread=Thread.currentThread();
        System.out.println(thread);
        thread.setName("MyThread");
        System.out.println(thread);
        System.out.println(thread.getName());
        thread.setPriority(8);
        System.out.println(thread);
        System.out.println(thread.getPriority());
        thread.setPriority(11);
        System.out.println(thread);
    }
}
public class ThreadMethodsDemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        MyThread myThread1=new MyThread();
        myThread1.start();
    }
}
