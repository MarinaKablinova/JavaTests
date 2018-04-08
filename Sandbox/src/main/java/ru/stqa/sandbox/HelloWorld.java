package ru.stqa.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        hello("world");

    Square s = new Square(5);

    Rectangle r = new Rectangle(4, 6);
    r.a = 4;
    r.b = 6;
    System.out.println("New area = " + area(r));
    System.out.println("Площадь квадрата равна" + area(s));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(Square s){
        return s.l*s.l;
    }

    public static double area(Rectangle r){
        return r.a*r.b;
    }
}