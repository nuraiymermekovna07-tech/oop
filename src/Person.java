public class Person {
    String fio;
    int age;
    String nation;
    String gender;
    String proffession;
    boolean holostoi;

    public String run(){
        return this.fio + "can run";
    }
    public String speak() {
        return this.fio + "can speak";
    }
    public int getBirthDate() {
        return 2026-this.age;

    }
}
