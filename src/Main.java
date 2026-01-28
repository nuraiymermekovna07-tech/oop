//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fio = "Ularbekov Shaamidin";
        person1.age = 16;
        person1.gender = "Male";
        person1.nation = "Kyrgyz";
        person1.proffession = "Java developer";
        person1.holostoi = true;

        System.out.println("FIO:" + person1.fio);
        System.out.println("Age:" + person1.age);
        System.out.println("Gender:" + person1.gender);
        System.out.println("Nation:" + person1.nation);
        System.out.println("Prof:" + person1.profession);
        System.out.println("Holostoi:" + person.holostoi);


        System.out.println(person1.run());
        System.out.println(person1.speak());
        System.out.println(person1.getBirthDate());


        }
    }
}