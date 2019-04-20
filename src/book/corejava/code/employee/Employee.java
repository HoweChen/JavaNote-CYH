package book.corejava.code.employee;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private Double salary;
    private LocalDate hireDay;

    Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    String getName() {
        return name;
    }


    Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    LocalDate getHireDay() {
        return (LocalDate) hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
