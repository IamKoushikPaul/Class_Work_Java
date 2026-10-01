
class Main {
    private int id;
    private String name;

    // Parameterized Constructor
    Main(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Main(Main obj1) {
        id = obj1.id;
        name = obj1.name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        // First object
        Main obj1 = new Main(101, "Koushik");

        // Copy obj1 into obj2
        Main obj2 = new Main(obj1);

        obj1.display();
        obj2.display();
    }
}