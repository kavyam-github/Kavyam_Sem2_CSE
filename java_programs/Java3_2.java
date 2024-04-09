import java.util.Scanner;
public class Java3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a");
        System.out.println("please enter b");
        System.out.println("please enter c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
