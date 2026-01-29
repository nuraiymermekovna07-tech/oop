public class User {
    String name;
    String email;
    int age;

    public User(String name,String email,int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
        public String printInfo(){
       return "Name: "+name+"\nEmail: "+email+"\nAge: "+age;

    }
}
