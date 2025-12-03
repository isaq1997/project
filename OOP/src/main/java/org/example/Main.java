package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book=new Book(1,"123-678","Chamber","John Grisham");
        Pricing pricing=Pricing.Free;
        Pricing pricing1=Pricing.Starter;
        System.out.println(pricing1.getPrice()+" "+pricing1.isStatus());

        pricing1.setStatus(true);
        System.out.println(pricing1.getPrice()+" "+pricing1.isStatus());

        System.out.println(book.getName());

    }
}