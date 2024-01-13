package day1;

public class Car {
String car;
int price;
String color;
String type;
int year;

    public Car(String car, int price, String color, String type, int year) {
        this.car = car;
        this.price = price;
        this.color = color;
        this.type = type;
        this.year = year;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String car, int price, String color) {
        this.car = car;
        this.price = price;
        this.color = color;
    }
//    public abstract class car features() {
//        System.out.println("This car can run!!!!");
//    }

    public static void features(String color) {
        System.out.println("The color of the car is =:" + color);

    }

    public static void features(int price) {
        System.out.println("The price of the car is  =:" + price);
    }

    public static void features(String model, int year, String type) {
        System.out.println("The model of the car is =:" + model);
        System.out.println("The year of the car is =:" + year);
        System.out.println("The type of the car is =:" + type);
    }
}