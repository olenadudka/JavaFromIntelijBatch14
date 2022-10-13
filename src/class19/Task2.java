package class19;

public class Task2 {
    public static void main(String[] args) {
        Book headFirstJava=new Book("Head first java","Kathy", 12,13345);
        Book dataStructures=new Book("Data structures","Katy", 12);
    }
}
class Book{

    String name;
    String author;
    int noOfTotalCh;
    int ISBN;

    public Book(String name, String author, int noOfTotalCh, int ISBN){
        /*this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;*/
        this(name, author,noOfTotalCh);
        this.ISBN=ISBN;
    }

    public Book(String name, String author, int noOfTotalCh){
        this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;
    }
}
