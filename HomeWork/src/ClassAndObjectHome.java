public class ClassAndObjectHome {
    public ClassAndObjectHome() {
    }

    public static void main(String[] args) {
        Person FirstPerson = new Person();
        FirstPerson.name = "Frank";
        FirstPerson.surname = "Musk";
        FirstPerson.age = 34;
        FirstPerson.phone = "055-555-55-55";
        Person SecondPerson = new Person();
        SecondPerson.name = "Alice";
        SecondPerson.surname = "Smith";
        SecondPerson.age = 25;
        SecondPerson.phone = "077-664-32-10";
        System.out.println("First person");
        System.out.println("Name: " + FirstPerson.name);
        System.out.println("Surname: " + FirstPerson.surname);
        System.out.println("Age: " + FirstPerson.age);
        System.out.println("Phone: " + FirstPerson.phone);
        System.out.println();
        System.out.println("Second person:");
        System.out.println("Name: " + SecondPerson.name);
        System.out.println("Surname: " + SecondPerson.surname);
        System.out.println("Age: " + SecondPerson.age);
        System.out.println("Phone: " + SecondPerson.phone);
    }

    public static class Person {
        String name;
        String surname;
        int age;
        String phone;

        public Person() {
        }
    }
}