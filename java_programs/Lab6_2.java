class Book{
    private  String author_name;   

        Book( String author_name){
           this.author_name=author_name;

        }
     
    void display(){
        System.out.println("Author_name: "+author_name);
    } 

}



class  Book_publication extends Book{

    private String title;
        Book_publication(String title,String author_name){
            super(author_name);
            this.title=title;
        }

        void display_Book(){
            display();
            System.out.println("Title of Book: "+title);
        }

        }







class  Paper_publication extends Book{

    private String title;
    Paper_publication(String title,String author_name){
        super(author_name);
        this.title=title; 
    }
    void display_Paper(){
        display();
        System.out.println("Title of Paper: "+title);
    }

}





public class Lab6_2 {

    public static void main(String[] args) {
        Paper_publication paper =new Paper_publication(args[2],args[0]);
        Book_publication book= new Book_publication(args[1],args[0]);
        paper.display_Paper();
        book.display_Book();
    }
}

