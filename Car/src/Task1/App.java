// Класс Employee и SalaryCalculator разделены, что соотв. принципу единой ответственности (SRP)

package Task1;

import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) {

        int baseSalary = 100000; 
        String name = "George";

        SalaryCalculator calculator = new SalaryCalculator();
        int salaryEmp1 = calculator.calculateNetSalary(baseSalary);
        Date currentDate = Calendar.getInstance().getTime();

        Employee employee1 = new Employee(name, currentDate, salaryEmp1);

        System.out.println(employee1.getEmpInfo());
    }
    
}
