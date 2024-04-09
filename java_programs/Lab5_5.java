import java.util.Scanner;
class Complex{
    int real;
    int complexpart;
    Complex c3;
    
  /*  Complex(){
        real=1;
        complexpart=1;
        System.out.println("Complex number: "+real+"i"+complexpart);
    }*/
    Complex()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number");
        real= sc.nextInt();
        System.out.println("Enter a complex number");
        complexpart= sc.nextInt();
        System.out.println("Complex number: "+real+" + "+complexpart+"i");
    }
    
    public void addComplex(Complex sum){
        sum.real+= this.real;
        sum.complexpart+= this.complexpart;
        System.out.println("sum: "+sum.real+" + "+sum.complexpart+"i");
    }
}
public class Lab5_5 {
    
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.addComplex(c2);
        
        System.out.println(c2.real+" + "+c2.complexpart+"i");
}

}