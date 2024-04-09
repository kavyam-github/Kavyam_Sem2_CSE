import java.util.Scanner;

public class SecondHalfString {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a string: ");
       String inputString = scanner.nextLine();

       int stringLength = inputString.length();
      System.out.println("Length of the string: " + stringLength);
       for(int i=stringLength/2;i<stringLength;i++){
        System.out.print(inputString.charAt(i));
       }
}
}
       
