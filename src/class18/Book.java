package class18;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String name;
    String author;
    int pages;

     Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }
    void print() {
        System.out.println("name " + name + " author " + author+" has pages "+pages);}

    Book(String name, String author) {
            this.name = name;
            this.author = author;
        }
        void print2 () {
            System.out.println("name " + name + " author " + author);
        }

    public static void main(String[] args) {
        Book book1=new Book("11 minutes", "Paulo Coelho", 147);
        book1.print();

        Book book2=new Book("Life", "King");
        book2.print2();
    }
}
