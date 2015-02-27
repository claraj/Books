package company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kali Linux team person's work");
        System.out.println("Mac team person's work");

        System.out.println("Welcome to the bookstore program");

        //Test book creation

        Book b = new Book("Orwell", "1984", 9.99);

        Bookstore bookstore = new Bookstore();

        bookstore.addBook(b);

        //Some code that is being modified at the same time as root

        Book b2 = new Book("King Lear", "Shakespeare", 6.99);
        bookstore.addBook(b2);

        bookstore.printAllBooks();


        Book b3 = new Book("Treasure Island", "Stevenson", 9.44);

        bookstore.printAllBooks();



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
        System.out.println("Added " + b);
        allBooks.add(b);
    }

    //Some code being modified at the same time as clara

    public void printAllBooks(){
        System.out.println("All books in Bookstore:");
        for (Book b : allBooks) {
            System.out.println(b);
        }
    }




}
