// 1. Java program to implement single inheritance

class singleIn{
    
    public static void main(String[] args) {
        child ch=new child();
        ch.p();
        ch.c();
    }
}
class parent{
    public void p(){
        System.out.println("Parent");
    }
}
class child extends parent{
    public void c(){
        System.out.println("Child");
    }
}