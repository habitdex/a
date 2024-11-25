class Area {
    public void calculateArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    public void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea(5);
        area.calculateArea(5, 10);
    }
}

