public class Single_Level {

    class Animal {
        public void eat() {
            System.out.println("eating...");
        }
    }

    class Dog extends Animal {
        public void bark() {
            System.out.println("barking...");
        }
    }

    class Main {
        public static void main(String args[]) {

            Single_Level obj = new Single_Level();

            // {
            //     Animal obj_animal = obj.new Animal();
            // }

            Dog obj_dog = obj.new Dog();

            //obj_dog.bark();

            obj_dog.eat();
            obj_dog.bark();
        }
    }
}