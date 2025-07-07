package javaProblems;
import java.util.*;

class Product{
    String name;
    double price;
    double discount;

    Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getFinalPrice(){
        double discountAmount = price * discount / 100;
        return price - discountAmount;
    }
    
    public void printDetail(){
        System.out.println("\n--- Bill Details ---");
        System.out.println("Product Name   : " + name);
        System.out.println("Original Price : ₹" + price);
        System.out.println("Discount       : " + discount + "%");
        System.out.println("Final Price    : ₹" + String.format("%.2f", getFinalPrice()));
    }
}

public class DiscountCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        Product item = new Product(name, price, discountPercent);

        item.printDetail();

        sc.close();
    }
}
