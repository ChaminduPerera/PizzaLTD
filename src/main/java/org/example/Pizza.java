package org.example;

public class Pizza {
    private int size;
    private double price;
    private int noOfPie;

    public Pizza(int size, double price, int noOfPie) {
        this.size = size;
        this.price = price;
        this.noOfPie = noOfPie;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfPie() {
        return noOfPie;
    }

    public void setNoOfPie(int noOfPie) {
        this.noOfPie = noOfPie;
    }
}

