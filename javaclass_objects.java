// A Class is like an object constructor,
// or a "blueprint" for creating objects

public class javaclass_objects {
    int x = 5;

    public static void main(String[] args) {
        javaclass_objects myobj1 = new javaclass_objects();
        javaclass_objects myobj2 = new javaclass_objects();
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);

        myobj1.myMethod();
        myobj1.speed(200);
    }

    static void myMethod() {
        System.out.println("It works");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is " + maxSpeed);
    }
}
