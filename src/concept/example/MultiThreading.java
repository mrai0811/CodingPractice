package concept.example;

public class MultiThreading {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            for(int i = 1; i <= 5; i++){
                System.out.println("Thread 1 : " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            }
            }
        }) ;

        Thread thread2 = new Thread(() ->{

            for(int i = 0; i <= 5; i++){
                System.out.println("Thread 2 : " + i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println("Thread 2 interrupted");
                }
            }
        });
        //start both threads
        thread.start();
        thread2.start();
    }
}
