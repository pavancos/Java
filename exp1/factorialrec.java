import java.util.Scanner;

public class factorialrec {
    public  static int factor(int a){
        if(a==0) return 1;
        else{
            return a*factor(a-1);
        }
    } 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int fact=factorialrec.factor(a);
        System.out.println(fact);
    }
}
