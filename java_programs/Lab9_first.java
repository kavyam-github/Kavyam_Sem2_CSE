public class Lab9_first {
   
public static void main(String[] args) {
    GoodMorning gm = new GoodMorning();
    gm.start();
    GoodAfternoon ga = new GoodAfternoon();
    ga.start();
}

}
class GoodMorning extends Thread{
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("good morning");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

class GoodAfternoon extends Thread{
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("good afternoon");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}