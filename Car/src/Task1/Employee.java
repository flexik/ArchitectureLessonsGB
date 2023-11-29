package Task1;

import java.util.Date;

public class Employee {

    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "Name - " + name + ", dob - " + dob.toString() + " // Зар. плата: " + baseSalary + " $ ";
    }


}
