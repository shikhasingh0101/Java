class Counter {
    private int count = 0;

    
    public synchronized void increment() {
        count++;
    }

   
    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

   
    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
      
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedCounterExample {
    public static void main(String[] args) {
        Counter counter = new Counter();  


        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);
        Thread thread3 = new CounterThread(counter);

      
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

   
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
