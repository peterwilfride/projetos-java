package org.example.entity;

public class EmployeeBusinessLogic {

    public double calculateYearSalary(Employee emp) {
        return emp.getMonthSalary() * 12;

    }

    public double calculateAppraisal(Employee emp) {
        double appraisal = 0;

        if(emp.getMonthSalary() < 10000){
            appraisal = 500;
        }else{
            appraisal = 1000;
        }

        return appraisal;
    }
}
