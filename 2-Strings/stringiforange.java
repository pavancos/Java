// Write a program to check if the word 'orange' is present in the "This is orange juice".
import java.util.*;
public class stringiforange {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String text = new String(get.nextLine());
        System.out.print(text.contains("orange"));
    }
}
