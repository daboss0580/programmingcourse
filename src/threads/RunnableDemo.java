package threads;
class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=10; i++)
            System.out.println(i+" ");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        Thread3 thread3=new Thread3();
        Thread thread=new Thread(thread3);
        thread.start();
    }
}
