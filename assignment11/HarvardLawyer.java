package com.company;

//A class to represent HarvardLawyer
public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        // 20% more money than a normal lawyer
        return super.getSalary() + super.getSalary() * 0.2;
    }

    public int getVacationDays() {
        // 3 days more vacation
        return super.getVacationDays() + 3;
    }

    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }

}