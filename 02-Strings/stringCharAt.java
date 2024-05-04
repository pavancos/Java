import java.util.*;

public class stringCharAt {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String text = new String(get.nextLine());
        System.out.print(text.indexOf('o') + " ");
        System.out.print(text.lastIndexOf('o') + " ");
        System.out.print(text.indexOf(',') + " ");
    }
}
