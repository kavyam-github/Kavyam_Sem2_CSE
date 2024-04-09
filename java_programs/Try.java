import java.util.Scanner;

public class SecondHalfString {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a string: ");
       String inputString = scanner.nextLine();

       int stringLength = inputString.length();
       // int stringLength=0;
       // int inputString=0;
       for(int i=stringLength/2;i<stringLength;i++){
        System.out.println(str.charAt(i));
       }
}
}
       
