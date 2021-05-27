package day43_list_custom_classes;
//name, age
public class Person {
    //Data -> v
    String name;
    int age;
    char gender;
    //behaviour -> method
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class People {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.name = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.name);
        System.out.println(person2.age);

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println("person1.firstname= " + person1.name);
    }
}