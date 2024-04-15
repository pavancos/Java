// Write code to remove Spaces from a string with StringTokenizer
import java.util.*;
public class stringTokenRemSpaces {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("This is a test string", " ");
        String x = "";
        while (s.hasMoreTokens()) {
            x+=s.nextToken();
        }
        System.out.println(x);
    }   
}
