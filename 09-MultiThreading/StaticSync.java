class Hello {
    public synchronized static void display() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.print(t.getName()+" ");
            System.out.println("Hello");
            try {
                t.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
class T extends Thread {
    public void run() {
        Hello.display();
    }
}
class StaticSync {
    public static void main(String args[]) {
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();
        t1.start();t2.start();t3.start();
    }
}
