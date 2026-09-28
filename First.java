class main{
    private int id;
    private String name;

    public void setter(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void getter(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args){
        main obj = new main();
        obj.setter(100, "John");
        obj.getter();
    }

}