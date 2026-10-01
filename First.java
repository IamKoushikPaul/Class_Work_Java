class Main {
    private int id;
    private String name;

    public void setter(int id, String Name) {
        this.id = id;
        name = Name;
    }

    public void getter() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Main obj1= new Main();

        obj1.setter(100, "John");
        obj1.getter();
    }
}