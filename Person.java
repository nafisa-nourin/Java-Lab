//27-01-26 Single inheritance

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Employee extends Person {
    int empId;
    int salary;

    Employee(String n, int a, int id, int s) {
        super(n, a);
        empId = id;
        salary = s;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(empId);
        System.out.println(salary);
    }

    public static void main(String args[]) {
        Employee e = new Employee("Ayaan", 22, 101, 30000);
        e.display();
    }
}

