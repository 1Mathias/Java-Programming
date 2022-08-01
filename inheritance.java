public class inheritance {
    protected String carbrand="Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class  Car extends inheritance{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.carbrand + " " + myFastCar.modelName);
    }
}
