public class Cat {
    private String name;
    private String ownerName;
    private int age;

    public Cat(String name, String ownerName, int age) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
    }

    public String printInfo() {
        return this.name + " " + this.ownerName + " " + this.age;

    }
}


