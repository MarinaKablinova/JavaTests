package ru.stqa.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        hello("world");
    double l = 6;
    double a = 4;
    double b = 54;
    System.out.println("New area = " + area(a,b));
    System.out.println("Площадь квадрата равна" + area(l));
    }

    public static void hello(String somebody){

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l){
        l = 36;
        return l*l;

    }

    public static double area(double a, double b){
        return a*b;
    }
}