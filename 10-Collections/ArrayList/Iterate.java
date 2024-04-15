import java.util.*;
public class Iterate {
    public static void main(String[] args) {
        ArrayList<String>Colors=new ArrayList<>();
        Colors.add("yellow");Colors.add("blue");
        Colors.add("black");Colors.add("red");
        Colors.add("white");System.out.println(Colors);
        for (String i : Colors) {
            System.out.println(i);
        }
    }    
}
