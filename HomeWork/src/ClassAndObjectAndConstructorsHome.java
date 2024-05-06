public class ClassAndObjectAndConstructorsHome {
    public static class Employee {
        int id;
        String name;
        String surname;
        String phone;
        String address;
        int salary;

        Employee() {
            System.out.println("Default Constructor Called");
        }

        Employee(String name, String surname, String phone, String address, int salary, int id) {
            this.name = name;
            this.surname = surname;
            this.phone = phone;
            this.address = address;
            this.salary = salary;
            this.id = id;
            System.out.println("ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Phone: " + phone + ", Address: " + address + ", Salary: " + salary + "$ per year");
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Elon", "Musk", "6667-55-43", "123 Street, City", 100344024, 1);
        Employee emp2 = new Employee("John", "Musk", "123-456-7890", "456 Avenue, Town", 54064, 2);
        Employee emp3 = new Employee("Alice", "Karen", "066-555-55-55", "789 Road, Village", 33433, 3);
        Employee emp4 = new Employee("Bob", "Cage", "123-456-7890", "321 Lane, County", 20300, 4);
        Employee emp5 = new Employee("Michael", "Jordan", "999-888-7777", "567 Broadway, City", 987654321, 5);
        Employee emp6 = new Employee("Emma", "Watson", "111-222-3333", "890 Park Street, Town", 123456789, 6);
        Employee emp7 = new Employee("David", "Beckham", "444-555-6666", "234 River Road, Village", 987654321, 7);
        Employee emp8 = new Employee("Serena", "Williams", "777-888-9999", "543 Lakeview Avenue, County", 234567890, 8);
        Employee emp9 = new Employee("Taylor", "Swift", "222-333-4444", "876 Hillside Drive, Suburb", 345678901, 9);


        System.out.println("Employee 1: ");
        System.out.println("Name: " + emp1.name);
        System.out.println("Surname: " + emp1.surname);
        System.out.println("Phone: " + emp1.phone);
        System.out.println("Address: " + emp1.address);
        System.out.println("Salary: " + emp1.salary + "$");
        System.out.println("ID: " + emp1.id);

        System.out.println("Employee 2: ");
        System.out.println("Name: " + emp2.name);
        System.out.println("Surname: " + emp2.surname);
        System.out.println("Phone: " + emp2.phone);
        System.out.println("Address: " + emp2.address);
        System.out.println("Salary: " + emp2.salary + "$");
        System.out.println("ID: " + emp2.id);

        System.out.println("Employee 3: ");
        System.out.println("Name: " + emp3.name);
        System.out.println("Surname: " + emp3.surname);
        System.out.println("Phone: " + emp3.phone);
        System.out.println("Address: " + emp3.address);
        System.out.println("Salary: " + emp3.salary + "$");
        System.out.println("ID: " + emp3.id);

        System.out.println("Employee 4: ");
        System.out.println("Name: " + emp4.name);
        System.out.println("Surname: " + emp4.surname);
        System.out.println("Phone: " + emp4.phone);
        System.out.println("Address: " + emp4.address);
        System.out.println("Salary: " + emp4.salary + "$");
        System.out.println("ID: " + emp4.id);


        System.out.println("Employee 5: ");
        System.out.println("Name: " + emp5.name);
        System.out.println("Surname: " + emp5.surname);
        System.out.println("Phone: " + emp5.phone);
        System.out.println("Address: " + emp5.address);
        System.out.println("Salary: " + emp5.salary + "$");
        System.out.println("ID: " + emp5.id);

        System.out.println("Employee 6: ");
        System.out.println("Name: " + emp6.name);
        System.out.println("Surname: " + emp6.surname);
        System.out.println("Phone: " + emp6.phone);
        System.out.println("Address: " + emp6.address);
        System.out.println("Salary: " + emp6.salary + "$");
        System.out.println("ID: " + emp6.id);

        System.out.println("Employee 7: ");
        System.out.println("Name: " + emp7.name);
        System.out.println("Surname: " + emp7.surname);
        System.out.println("Phone: " + emp7.phone);
        System.out.println("Address: " + emp7.address);
        System.out.println("Salary: " + emp7.salary + "$");
        System.out.println("ID: " + emp7.id);

        System.out.println("Employee 8: ");
        System.out.println("Name: " + emp8.name);
        System.out.println("Surname: " + emp8.surname);
        System.out.println("Phone: " + emp8.phone);
        System.out.println("Address: " + emp8.address);
        System.out.println("Salary: " + emp8.salary + "$");
        System.out.println("ID: " + emp8.id);

        System.out.println("Employee 9: ");
        System.out.println("Name: " + emp9.name);
        System.out.println("Surname: " + emp9.surname);
        System.out.println("Phone: " + emp9.phone);
        System.out.println("Address: " + emp9.address);
        System.out.println("Salary: " + emp9.salary + "$");
        System.out.println("ID: " + emp9.id);
    }
}


