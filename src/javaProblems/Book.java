package javaProblems;
import java.util.*;

class Books{
    String title;
    String author;
    int yearPublished;
    double price;

    Books(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    void displayInfo(){
        System.out.println("Book Title: "+title);
        System.out.println("Author of the book: "+author);
        System.out.println("Year Published: "+yearPublished);
        System.out.println("Price of the book: "+price);
    }
}
public class Book {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Year published: ");
        int year = sc.nextInt();

        System.out.print("Price of the book");
        double price = sc.nextDouble();

        Books b = new Books(title, author, year, price);

        b.displayInfo();
    }
}
