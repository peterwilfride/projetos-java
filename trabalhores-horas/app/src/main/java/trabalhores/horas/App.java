/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trabalhores.horas;

import java.sql.Date;

import trabalhores.horas.entity.Department;
import trabalhores.horas.entity.HourContract;
import trabalhores.horas.entity.Worker;
import trabalhores.horas.entity.WorkerLevel;

public class App {
    public static void main(String[] args) {

        Department department = new Department("Design");
        
        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, department);

        HourContract contract1 = new HourContract(new Date(2018,8,20), 50.0, 20); 
        worker.addContract(contract1);

        HourContract contract2 = new HourContract(new Date(2016,6,13), 30.0, 18);
        worker.addContract(contract2);

        HourContract contract3 = new HourContract(new Date(2018,8,25), 80.0, 10);
        worker.addContract(contract3);

        int monthSearch = 8;
        int yearSearch = 2018;

        Double salary = worker.income(yearSearch, monthSearch);

        System.out.println(worker);
        System.out.printf("income from %d/%d : %.2f%n", monthSearch, yearSearch, salary);
    }
}