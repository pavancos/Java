import java.util.Scanner;

class UserDef extends Exception{
    public UserDef(String args){
        super(args);
    }
}
public class CallUserDef {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            int a=s.nextInt();
            if(a>100){
                throw new UserDef("Marks > 100");
            }
            else{
                System.out.println("Marks: "+a);
            }
        }catch(UserDef e){
            System.out.println(e.getMessage());
        }
    }
}
