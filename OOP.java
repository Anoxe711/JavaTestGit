class Employee {
    public String name;

    public int calculatePay() {
        return 0;
    }
}

class Manager extends Employee {
    @Override 
    public int calculatePay() {
        return 1000;
    }

}

class Developer extends Employee {
    public int hoursWorked;
    @Override 
    public int calculatePay() {
        return hoursWorked * 20;
    }
}

class Intern extends Employee {
    @Override 
    public int calculatePay() {
        return 200;
    }
}

public class OOP {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        Manager manager = new Manager();
        manager.name = "Анна";
        employees[0] = manager;

        Developer dev = new Developer();
        dev.name = "Кеша";
        employees[1] = dev;
        dev.hoursWorked = 50;

        Intern intern = new Intern();
        intern.name = "Олег";
        employees[2] = intern;

        for(Employee emp : employees) {
            System.out.println("Сотрудник " + emp.name + " получает " + emp.calculatePay() + " монет.");
        }
    }
}