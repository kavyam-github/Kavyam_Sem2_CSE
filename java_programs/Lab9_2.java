public class Lab9_2 {
   public static void main(String[] args) {
    EvenNum e = new EvenNum();
    e.start();
    OddNum o = new OddNum();
    o.start();
   } 
}

class EvenNum extends Thread{
    public void run(){
        try{
            for(int i=0;i<20;i+=2){
                System.out.println("even numer: " +i);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class OddNum extends Thread{
    public void run(){
        try{
            for(int i=1;i<20;i+=2){
                System.out.println("odd numer: " +i);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}