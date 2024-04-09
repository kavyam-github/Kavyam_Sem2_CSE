import java.util.Scanner;

public class lab4_3{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      
       int[] numbers = new int[4];
       System.out.println("Enter 4 integer values:");
       for (int i = 0; i < numbers.length; i++) {
           numbers[i] = scanner.nextInt();
       }
       
       int sum = 0;
       for (int number : numbers) {
           sum += number;
       }

       double average = (double) sum / numbers.length;

       System.out.println("The average of the array values is: " + average);
}
}