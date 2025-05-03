package concept.example;

public class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Runnable running in thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());

        t1.start();
    }
}
