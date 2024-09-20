
class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        Runnable thread1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };

        
        Thread t1 = new Thread(thread1); 
        Thread2 t2 = new Thread2(); 

      
        t1.setName("Runnable-Thread");
        t2.setName("Extended-Thread");

        
        t1.start();
        t2.start();
    }
}
