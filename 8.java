class Shape {
    public void print() {
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape {
    public void print() {
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon {
    public void print() {
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon {
    public void print() {
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle {
    public void print() {
        System.out.println("Square is a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Polygon p = new Polygon();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Square sq = new Square();

        s.print();
        p.print();
        r.print();
        t.print();
        sq.print();
    }
}

