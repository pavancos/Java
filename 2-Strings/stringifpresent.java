// Write a program to check if the letter 'e' is present in the word 'Umbrella'.
import java.util.Scanner;
public class stringIfPresent {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String a = new String(get.next());
        boolean per = false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) == 'e') {
                per = true;
                break;
            }
        System.out.println(per);
    }
}
