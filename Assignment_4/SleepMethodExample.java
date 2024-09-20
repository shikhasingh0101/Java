class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepMethodExample {
    public static void main(String[] args) {
        SleepThread thread1 = new SleepThread();
        SleepThread thread2 = new SleepThread();
        
        thread1.start();
        thread2.start();
    }
}
