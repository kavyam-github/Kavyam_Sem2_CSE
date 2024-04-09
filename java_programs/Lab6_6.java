import java.util.Scanner;

class Human{
    Scanner sc= new Scanner(System.in);
    String Name;

    Human(String Name){

        this.Name=Name;

    }
    void display(){
        System.out.println("Name of Human: "+Name);
        String s = sc.nextLine();
    }
}

 class Height extends Human{
    float Height;

    Height(float Height,String Name){
        super(Name);
        this.Height=Height;
    }
     void display(){
        System.out.println("Enter Height: "+Height);
        float h = sc.nextFloat();
     }

 }
 class rollno extends Human{
   int rollno;
    rollno(float rollno,String Name){
        super(Name);
    }
    void display(){
        System.out.println("Enter rollno: "+rollno);
        int r= sc.nextInt();
    }
 }



 public class Lab6_6 {
    public static void main(String[] args) {
    Height hg = new Height(0, null);
    rollno r= new rollno(0, null);
       
        
    }
}