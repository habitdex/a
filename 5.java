class Student {
    String name = "unknown";
    int age = 0;
    String address = "not available";

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setInfo("Mohit", 20, "Bangalore");
        student.display();
    }
}

