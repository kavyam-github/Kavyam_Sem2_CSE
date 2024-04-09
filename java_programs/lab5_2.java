public class lab5_2 {
    public static void main(String[] args) {
        Time T1=new Time(5,3);
        System.out.println(T1.hour);
        System.out.println(T1.min); 

        Time T2=new Time();
        System.out.println(T2.hour);
        System.out.println(T2.min);
    }
}

class Time{
    float hour;
    float min;

    public Time() {
        this.hour = 5;
        this.min = 1;
    }

    public Time(float hour, float min) {
        this.hour = hour;
        this.min = min;
    }
    public void displayValidTime() {
        System.out.println("Time :"+this.hour +"Time: "+this.min);
    }
}
