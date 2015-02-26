package company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the bookstore program");

        //Test book creation

        Book b = new Book("Orwell", "1984", 9.99);

        Bookstore bookstore = new Bookstore();

        bookstore.addBook(b);


        //Some code that is being modified at the same time as root

        Book b2 = new Book("King Lear", "Shakespeare", 6.99);
        bookstore.addBook(b2);

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

    //Some code being modified at the same time as clara
    public String toString(){
        return author + " " + title + " " + price;
    }
}

class Bookstore {
    ArrayList<Book> allBooks;
    Bookstore() {
        allBooks = new ArrayList<Book>();
    }

    public void addBook(Book b){
        allBooks.add(b);
    }

    //Some code being modified at the same time as clara

    public void printAllBooks(){
        for (Book b : allBooks) {
            System.out.println(b);
        }
    }

}
