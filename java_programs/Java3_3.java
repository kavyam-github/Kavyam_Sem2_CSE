import java.util.Scanner;
public class Java3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a");
        int a=sc.nextInt();
        int i; int count=0;
        for(i=1;i<=a;i++){
            if(a%i==0){
                count=count+1;
            }
}
    if(count<=2){
        System.out.println("number is prime");
    }
    else{
        System.out.println("number is not prime");
    }
    }
}
