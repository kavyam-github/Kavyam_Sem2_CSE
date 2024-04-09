import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Entyer age :");
       int a = sc.nextInt();
       try{
        if (a<18) {
            throw new UnderAge("You are not aligible");
          }
          else{
            System.out.println("You are able");
          }
   
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}

class UnderAge extends Exception{
    public UnderAge(String msg){
        super(msg);
    }
}