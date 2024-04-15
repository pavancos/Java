// Write code to split a string by a delimiter using StringTokenizer
import java.util.*;
public class stringTokenSplit {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("11&4$d#89%11$t%100%", "&$#%");
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }
}
