package thread;
class Thread1 extends Thread{
    public void run(){
        Thread thread=Thread.currentThread();
        thread.setName("Thread10");
        for (int i=1; i<=10; i++)
            System.out.println(thread.getName()+":"+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        Thread thread=Thread.currentThread();
        thread.setName("Thread20");
        for (int i=10; i>=1; i--)
            System.out.println(thread.getName()+":"+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
        Thread2 thread2=new Thread2();
        thread2.start();
    }
}
