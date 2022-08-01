public class getandset {
    private String name; // private = restricted access

    //Getter
    public String getName(){
        return  name;
    }
    //Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public static void main(String[] args){
        Person myobj=new Person();
        myobj.name="John"; //error
        System.out.println(myobj.name);// error
    }
}
