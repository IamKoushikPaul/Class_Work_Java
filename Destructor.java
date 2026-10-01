public class Destructor {

    public static void main(String[] args) {

        System.out.println("This is inside the main method");

        Destructor obj1 = new Destructor();

        obj1 = null;

        System.gc();
    }

    protected void finalize() {
        System.out.println("The object is deleted");
    }
}