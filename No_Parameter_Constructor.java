public class No_Parameter_Constructor {
    private int id;
    private String name;
    No_Parameter_Constructor() {
        id = 100;
        name = "Koushik";
    }
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        No_Parameter_Constructor obj1 = new No_Parameter_Constructor();
        obj1.display();
    }
}
