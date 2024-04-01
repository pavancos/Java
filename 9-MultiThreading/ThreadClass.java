class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread());
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread());
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        Hello hlo=new Hello(); Hi hi=new Hi();
        hlo.start();hi.start();  
    }
}
