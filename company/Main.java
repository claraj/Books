package company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the bookstore program");

        //Test book creation

        Book b = new Book("Orwell", "1984", 9.99);


    }
}


class Book {
    protected String author;
    protected String title;
    protected double price;

    Book(String a, String t, double p) {
        this.author = a;
        this.title = t;
        this.price = p;
    }
}