import java.util.Scanner;
public class Java3_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         float  sum=0;
        float b=sc.nextFloat();
        float a= sc.nextFloat();
        float  c=sc.nextFloat();
        float  d=sc.nextFloat();
        float  e=sc.nextFloat();
        System.out.println(sum=((a+b+c+d+e)/500.0f)*100);
        if(sum>=60){
            System.out.println("First Division");
        }
        else if(sum>=50){
            System.out.println("Seconf Division");
        }
        else if(sum>=40){
            System.out.println("Third Division");
        }
       else{
        System.out.println("Fail");
       }
        }
}