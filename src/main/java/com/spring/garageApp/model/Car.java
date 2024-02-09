package com.spring.garageApp.model;



public class Car {
     public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW
         }
         private Long id;
    private String model;
    private String brand;
    private int year;
    private Color color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(String model, String brand, int year, Color color) {
        this.model = model;
        this.brand = brand;
        this.id=id;
        this.year = year;
        this.color = color;
    }

}
