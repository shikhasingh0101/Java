class SharedResource {
    private int item;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        int value = 0;
        while (true) {
            try {
                resource.produce(++value);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            try {
                resource.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
    }
}
