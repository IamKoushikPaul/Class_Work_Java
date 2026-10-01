public class Default_Constructor {

    public int id;
    public String name;

   public void setter(int id, String name) {
    this.id = id;
    this.name = name;}
                    
    public void getter() {
    System.out.println("ID: " + id);
        System.out.println("Name: " + name);}

        public static void main(String[] args) {
            Default_Constructor obj1 = new Default_Constructor();
            System.out.println("Id: " + obj1.id);
            System.out.println("Name: " + obj1.name);
        }
        
    }

