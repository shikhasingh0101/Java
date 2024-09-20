class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinMethodExample {
    public static void main(String[] args) {
        JoinThread thread1 = new JoinThread();
        JoinThread thread2 = new JoinThread();
        JoinThread thread3 = new JoinThread();

        thread1.start();
        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
        try {
            thread3.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");
    }
}
