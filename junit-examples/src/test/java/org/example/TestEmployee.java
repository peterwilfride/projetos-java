package org.example;

import org.example.entity.Employee;
import org.example.entity.EmployeeBusinessLogic;
import org.junit.Assert;
import org.junit.Test;

public class TestEmployee {
    Employee emp = new Employee();
    EmployeeBusinessLogic employeeBusinessLogic = new EmployeeBusinessLogic();

    @Test
    public void testcalculateYearSalary() {
        emp.setName("Pedro");
        emp.setMonthSalary(10000);
        emp.setAge(27);

        double yearSalary = employeeBusinessLogic.calculateYearSalary(emp);

        Assert.assertEquals(120000, yearSalary, 0.0);
    }
}
