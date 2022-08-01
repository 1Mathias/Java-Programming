public class constructor {
    int x;
    int modelYear;
    String modelName;

    public constructor(int year, String name) {
        modelName = name;
        modelYear = year;
    }

    public static void main(String[] args) {
        constructor mycar = new constructor(1969, "Mustang");
        System.out.println(mycar.modelYear + " " + mycar.modelName);
    }
}
