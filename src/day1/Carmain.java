package day1;

public class Carmain {

    public static void main(String[] args) {
        Car car = new Car("Bmw",80000,"black","honda",2023);
       car.features("Black");
       car.features(220000);
       car.features("honda",2023,"bmw");
        System.out.println(car.getCar()+ " " + car.getPrice());
    }

    }
