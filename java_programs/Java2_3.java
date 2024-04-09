import java.util.Scanner;
public class Java2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Result;
        char operator;
       Double num1,num2,result;
        System.out.println("Select the operator:+,-,/,*,%");
        operator= sc.next().charAt(0);
        System.out.println("please enter the first number:");
            num1=sc.nextDouble();
            System.out.println("please enter the second number:");
            num2=sc.nextDouble();
        switch (operator) {
            case '+':
            System.out.println(num1+num2 );
                break;
                 case '-':
             System.out.println(num1-num2 );
                break;
                 case '*':
            System.out.println(num1*num2 );
                break;
                 case '/':
            System.out.println(num1/num2 );
                break;
                 case '%':
            System.out.println(num1%num2 );
                break;
            default:
           System.out.println("Invalid operator");
                break;
            }
         sc.close();
            }
            
    }
    
