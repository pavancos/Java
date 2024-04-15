// 1. Java program to implement multiple inheritance

class multiIn{
    
    public static void main(String[] args) {
        child2 ch=new child2();
        ch.p();
        ch.c1();
        ch.c2();
    }
}
class parent{
    public void p(){
        System.out.println("Parent");
    }
}
class child1 extends parent{
    public void c1(){
        System.out.println("Child 1");
    }
}
class child2 extends child1{
    public void c2(){
        System.out.println("Child 2");
    }
}