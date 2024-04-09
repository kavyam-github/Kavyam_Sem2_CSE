abstract class vegetable{
    String name;
    String color;

    vegetable(String name, String color)
    {
        this.name=name;
        this.color=color;
    }
    abstract void display();

}

class potato extends vegetable{
    potato(String name, String color){
        super(name,color);
    }
   public void display()
    {
        System.out.println("name: "+ name + "color: "+ color);
    }
    public String toString()
    {
        return  "name : "+name + "  color : "+color;
    }

}
class tomato extends vegetable{
    tomato(String name, String color){
        super(name,color);
    }
   public void display()
    {
        System.out.println("name: "+name + "color: "+color);
    }
    public String toString()
    {
        return  "name : "+name + "  color : "+color;
    }
}
class brinjal extends vegetable{
    brinjal(String name, String color){
        super(name,color);
    }
   public void display()
    {
        System.out.println("name: "+name + "color: "+color);
    }
    public String toString()
    {
        return  "name : "+name + " color : "+color;
    }
}

public class LAB7_1{
    public static void main(String[] args){
        potato p = new potato("potato","yellow");
        System.out.println(p.toString());

        tomato t = new tomato("tomato","red");
        System.out.println(t.toString());

        brinjal b = new brinjal("brinjal","purple");
        System.out.println(b.toString());
    }
}