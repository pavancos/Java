class Hello {
    public void display() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            synchronized(this){
                System.out.print(t.getName()+" ");
                System.out.println("Hello");
                try {
                    t.sleep(1000);
                } catch (Exception e) {}
            }
        }
    }
}
class T extends Thread {
    Hello hlo;
    T(Hello hlo) {
        this.hlo = hlo;
    }
    public void run() {
        hlo.display();
    }
}
class BlockSync {
    public static void main(String args[]) {
        Hello hlo=new Hello();
        T t1 = new T(hlo);
        T t2 = new T(hlo);
        T t3 = new T(hlo);
        t1.start();t2.start();t3.start();
    }
}
