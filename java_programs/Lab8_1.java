public class Lab8_1 {
public static void main(String[] args) {
    try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
         int c = (a / b);

    }
    catch(Exception e){
        e.printStackTrace();
        //  System.out.println(e.getMessage());
    }
}
    
}