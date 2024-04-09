interface A{
    int a = 10;
}
interface A1 extends A{
    int b = 20;
}
interface A2 extends A{
    int c = 30;
}
interface A12 extends A1,A2{
    int d = 40;
}
class B implements A12{
    public void printVar1(){
        System.out.println("Variable of A is:"+a);
    }
    public void printVar2(){
        System.out.println("Variable of A1 is:"+b);
    }
    public void printVar3(){
        System.out.println("Variable of A2 is:"+c);
    }
    public void printVar4(){
        System.out.println("Variable of A12 is:"+d);
    }
}
public class Lab7_2 {

    public static void main(String[] args) {
        B b = new B();
        b.printVar1();
        b.printVar2();
        b.printVar3();
        b.printVar4();
}
}