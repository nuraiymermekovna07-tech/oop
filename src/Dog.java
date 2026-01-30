public class Dog {
    private String name;
    private String owner;
    private int age;

    public Dog(String name,String owner,int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }
    public String dogInfo() {
        return this.name + " " + this.owner + " " + this.age;
    }


}
