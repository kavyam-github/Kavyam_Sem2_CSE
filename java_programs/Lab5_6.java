class Counter{
    static int count=0;
   Counter(){
       count++;
   }
   
  public static int noOfCount(){
      return count;
  }
   
}
public class Lab5_6 {
   
   public static void main(String[] args) {
     //  System.out.println("Hello, World!");
       Counter c1 = new Counter();
       Counter c2 = new Counter();
       Counter c3 = new Counter();
       Counter c4 = new Counter();
       System.out.println("count of objects is :"+Counter.noOfCount());
}

}