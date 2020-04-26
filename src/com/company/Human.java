package com.company;

import java.sql.Timestamp;

public class Human {
    public String firstName;
    public String lastName;
    protected Phone mobile;
    public Animal pet;
    Car car;
    private Double salary = 3000.0;
    private Timestamp lastSalaryCheckTimestamp;
    private Double lastSalaryCheckValue;

    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("Wartość pensji nie może być mniejsza od zera!");
        }else{
            System.out.println("Nowa wartość pensji przekazana do systemu ksiągowego!");
            System.out.println("Aneks do umowy do odebrania od pani Hani z kadr.");
            System.out.println("US i ZUS już wiedzą o zmianaie wysokosci wypłaty ;)");
            this.salary = salary;
        }
    }

    public Double getSalary() {
        lastSalaryCheckTimestamp = new Timestamp(System.currentTimeMillis());
        lastSalaryCheckValue = salary;
        return salary;
    }

    public void getLastSalaryCheckInfo() {
        if (lastSalaryCheckValue == null) {
            System.out.println("Ostatnie sprawdzanie pensji: brak");
        }else{
            System.out.println("Ostatnie sprawdzanie pensji: " + lastSalaryCheckTimestamp + " Pensja: " + lastSalaryCheckValue);
        }
    }
}
