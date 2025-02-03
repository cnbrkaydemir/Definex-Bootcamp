package com.cnbrkaydemir.model;

import java.io.Serializable;

public class Building implements Serializable {

    private double price;

    private double area;

    private int numberOfRooms;

    private int numberOfSalons;

    public Building(double price, double area, int numberOfRooms, int numberOfSalons) {
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSalons = numberOfSalons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfSalons() {
        return numberOfSalons;
    }

    public void setNumberOfSalons(int numberOfSalons) {
        this.numberOfSalons = numberOfSalons;
    }

    @Override
    public String toString() {
        return  this.getClass().getName()+
                " with price= " + price +
                ", area= " + area +
                ", numberOfRooms= " + numberOfRooms +
                ", numberOfSalons= " + numberOfSalons ;
    }
}
