class JavaThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java");
        }
    }
}

class PythonThread implements Runnable {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Python");
        }
    }
}

class CppThread implements Runnable {
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("C++");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new JavaThread());
        Thread thread2 = new Thread(new PythonThread());
        Thread thread3 = new Thread(new CppThread());

        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
