import java.util.Scanner;
public class Java3_pelnum {
public static void main(String[] args) {
    int a,b,rem=0,sum=0;
    System.out.println("please enter a");
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=a;
    while (a!=0) {
        rem=a%10;
        sum=sum*10+rem;
        a=a/10;
        }
        if(sum==b){
            System.out.println("number is palidrome");
        }
        else{
            System.out.println("number is not palidrome");
        }
     
}
}
