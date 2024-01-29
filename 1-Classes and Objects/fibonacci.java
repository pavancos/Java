import java.util.Scanner;
public class fibonacci {
    void fib(int n){
        int fstN=0;
        int secN=1;
        System.out.println("Fibonacci Series Upto "+n+" : ");
        System.out.print(fstN+" ");
        System.out.print(secN+" ");
        for(int i=0;i<=n-3;i++){
            int nxtN=fstN+secN;
            System.out.print((nxtN)+" ");
            fstN=secN;
            secN=nxtN;
        }
        System.out.print("\n");
    }
    public static void main(String args[]){
        fibonacci obj=new fibonacci();
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        obj.fib(num);
        sc.close();
    }
    
}