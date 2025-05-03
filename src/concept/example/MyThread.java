package concept.example;

public class MyThread extends Thread{

    public void run(){
        System.out.println("Running thread number: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread tt1 = new MyThread();
        tt1.start();
    }
}
