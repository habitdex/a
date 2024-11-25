class Rectangle {
    int length, breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int side) {
        this.length = this.breadth = side;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(7);

        System.out.println("Area (no parameters): " + r1.calculateArea());
        System.out.println("Area (two parameters): " + r2.calculateArea());
        System.out.println("Area (one parameter): " + r3.calculateArea());
    }
}

