import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        LinkedList<String>Colors=new LinkedList<>();
        Colors.add("yellow");Colors.add("blue");
        Colors.add("black");Colors.add("red");
        Colors.add("white");System.out.println(Colors);
        Iterator<String> it = Colors.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }    
}
