import java.util.*;
public class Empty {
    public static void main(String[] args) {
        HashSet<String>Colors=new HashSet<>();
        Colors.add("yellow");Colors.add("blue");
        Colors.add("black");Colors.add("red");
        Colors.add("white");
        System.out.println(Colors.size());Colors.clear();
        System.out.println("After Clear: "+Colors.size());
    }    
}