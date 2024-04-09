import java.util.Scanner;
public class Javatemp {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the temperature in fahrenhit");
float f=sc.nextFloat();
System.out.println((f-32)*5/9.0);
sc.close();
 }

    
}
