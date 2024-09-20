class Resource1 {
    public synchronized void method1(Resource2 resource2) {
        System.out.println("Thread 1: Locked Resource1");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("Thread 1: Trying to lock Resource2");
        resource2.method2();
    }

    public synchronized void method2() {
        System.out.println("Thread 1: Locked Resource1 again");
    }
}

class Resource2 {
    public synchronized void method1(Resource1 resource1) {
        System.out.println("Thread 2: Locked Resource2");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("Thread 2: Trying to lock Resource1");
        resource1.method2();
    }

    public synchronized void method2() {
        System.out.println("Thread 2: Locked Resource2 again");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        final Resource1 resource1 = new Resource1();
        final Resource2 resource2 = new Resource2();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                resource1.method1(resource2);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                resource2.method1(resource1);
            }
        });

        thread1.start();
        thread2.start();
    }
}
