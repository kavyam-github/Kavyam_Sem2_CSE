import java.util.Scanner;
public class Java3_pelstr{
    public static void main(String[] args) {
        int flag=0;
       System.out.println("enter string");
      int start=0;
      Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int end=s.length()-1;
        int n = s.length();
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                flag =  1;
                break;
            }
            start++;
            end--;
        }
        if(flag==0){
            System.out.println("Number is peledrome");
        }
        else{
            System.out.println("Number is not peledrome");
        }
 }
}