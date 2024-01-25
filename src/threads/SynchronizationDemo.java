package threads;
class Table{
    synchronized void printTable(int n){
        for (int i=1; i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
class ThreadA extends Thread{
    Table table;
    ThreadA(Table table){
        this.table=table;
    }
    public void run(){
        table.printTable(8);
    }
}
class ThreadB extends Thread{
    Table table;
    ThreadB(Table table){
        this.table=table;
    }
    public void run(){
        table.printTable(9);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Table table=new Table();
        ThreadA threadA=new ThreadA(table);
        threadA.start();
        ThreadB threadB=new ThreadB(table);
        threadB.start();
    }
}
