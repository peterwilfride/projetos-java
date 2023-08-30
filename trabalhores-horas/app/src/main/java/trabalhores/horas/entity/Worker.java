package trabalhores.horas.entity;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contrats;
    private Department department;

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.contrats = new ArrayList<>();
        this.department = department;
    }
    
    public void addContract(HourContract contract) {
        contrats.add(contract);
    } 

    public void removeContract(HourContract contract) {
        contrats.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        List<HourContract> contractsFiltered = 
                    contrats.stream()
                    .filter(c -> 
                        c.getDate().getYear() == year && c.getDate().getMonth() == month
                    )
                    .toList();
        
        double salary = 0.0;   
        for (HourContract hourContract : contractsFiltered) {
            salary += hourContract.totalvalue();
        }
        
        this.baseSalary += salary;
        return this.baseSalary;
    }

    public String toString() {
        return "Name: " + name + "\nDepartment: " + department.getName();
    }
    
}
