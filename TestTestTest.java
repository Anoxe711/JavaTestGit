class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private double salary;
    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;
    public Manager (String name, double salary, double bonus) {
        super(name,salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
}


public class TestTestTest {
    public static void main(String[] args) {
        Manager Manager = new Manager("Женя", 50000, 15000);
        System.out.println("Имя: " + Manager.getName() + ", Зарплата: " + Manager.getSalary() + ", Бонус: " + Manager.getBonus());
    }
}