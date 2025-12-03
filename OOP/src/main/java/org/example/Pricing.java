package org.example;

public enum Pricing {
    Free (0,false),
    Starter   (3,false),
    Medium   (5,false),
    Premium    (9,false);

    private final double price;
    private boolean status;

    // Private constructor
    Pricing(double price ,boolean status){
        this.price = price;
        this.status=status;
    }
    public boolean isStatus(){return  status;};
    public void setStatus(boolean status){this.status=status;}
    public double getPrice() { return price; }
}