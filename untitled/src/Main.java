class Employee {
    Integer id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;

    // Default Constructor
    Employee() {
        System.out.println("Default Constructor Called");
    }

    // Constructor with name parameter
    Employee(String name) {
        this.name = name;
        System.out.println("Name Constructor Called with name: " + name);
    }

    // Constructor with name and surname parameters
    Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Name and Surname Constructor Called with name: " + name + " and surname: " + surname);
    }

    // Constructor with name, phone, and salary parameters
    Employee(String name, String phone, int salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        System.out.println("Name, Phone, and Salary Constructor Called with name: " + name + ", phone: " + phone + " and salary: " + salary);
    }
}

