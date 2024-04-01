class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(Thread.currentThread()+" ");
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(Thread.currentThread()+" ");
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class RunnableInt {
    public static void main(String[] args) {
        Hi hi=new Hi();Hello hlo=new Hello();
        Thread tHi=new Thread(hi);Thread tHlo=new Thread(hlo);
        tHi.start();tHlo.start();
    }
}
