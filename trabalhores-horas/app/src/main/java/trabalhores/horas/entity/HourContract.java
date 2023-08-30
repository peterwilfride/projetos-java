package trabalhores.horas.entity;

import java.sql.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalvalue() {
        return this.valuePerHour * this.hours;
    }

    public Date getDate() {
        return this.date;
    }
 }
