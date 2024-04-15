import java.util.*;
public class Append {
    public static void main(String[] args) {
        LinkedList<String>Colors=new LinkedList<>();
        Colors.add("yellow");Colors.add("blue");
        Colors.add("black");Colors.add("red");
        Colors.add("white");System.out.println(Colors);
        Colors.addLast("green");System.out.println(Colors);
    }    
}
