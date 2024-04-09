public class Lab9_1 {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        GoodAfternoon ga = new GoodAfternoon();
        Thread t1 =new Thread(ga);
        t1.start();
        Thread t2 =new Thread(gm);
        t2.start();
    }
}
class GoodMorning implements Runnable{
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class GoodAfternoon implements Runnable{
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

