public class Person {
    public String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void walking(){
        System.out.println("Walking with God");
    }
}
