import java.util.*;
import java.lang.*;
public class palindrome {
    boolean pal(String S){
        String revStr="";
        for(int i = S.length()-1; i >= 0; i--)
            revStr+=S.charAt(i);
        return ((S.equals(revStr)));
    }
    public static void main(String[] args) {
        Scanner Get=new Scanner(System.in);
        String Str=Get.next();
        palindrome Check=new palindrome();
        if(Check.pal(Str)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
        Get.close();
    }
}
