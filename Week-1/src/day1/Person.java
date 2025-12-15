package day1;

public class Person {
    String name;
    int age;

    // Parent constructor with 2 parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called:");
        System.out.println("Name = " + name + ", Age = " + age);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Sharan", 25, 101, 65000.00);
    }

}

class Employee extends Person {
    int empId;
    double salary;

    // Child constructor with multiple parameters
    Employee(String name, int age, int empId, double salary) {
        super(name, age);  // Passing multiple parameters to parent constructor

        this.empId = empId;
        this.salary = salary;

        System.out.println("Employee constructor called:");
        System.out.println("EmpID = " + empId + ", Salary = " + salary);
    }
}


