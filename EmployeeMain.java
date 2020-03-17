package com.company;

/*
 * Exercise 9.3
 * Write a class HarvardLawyer to accompany the other law firm classes described in this chapter.
 * Harvard lawyers are like normal lawyers, but they make 20% more money than a normal lawyer,
 * they get 3 days more vacation,
 * and they have to fill out four of the lawyer's forms to go on vacation.
 * That is, the getVacationForm method should return "pinkpinkpinkpink".
 * Make sure to interact with the superclass as appropriate.
 *
 * 3/17/2020
 * David Barnette
 */

public class EmployeeMain {

    public static void main(String[] args) {
        System.out.print("Employee: ");
        Employee jim = new Employee();
        System.out.print(jim.getHours() + "hrs, ");
        System.out.printf("$%.2f, ", jim.getSalary());
        System.out.print(jim.getVacationDays() + "days, ");
        System.out.println(jim.getVacationForm());

        System.out.print("Janitor: ");
        Employee stan = new Janitor();
        System.out.print(stan.getHours() + "hrs, ");
        System.out.printf("$%.2f, ", stan.getSalary());
        System.out.print(stan.getVacationDays() + "days, ");
        System.out.println(stan.getVacationForm());

        System.out.print("Lawyer: ");
        Employee pam = new Lawyer();
        System.out.print(pam.getHours() + "hrs, ");
        System.out.printf("$%.2f, ", pam.getSalary());
        System.out.print(pam.getVacationDays() + "days, ");
        System.out.println(pam.getVacationForm());

        System.out.print("Harvard Lawyer: ");
        Employee michael = new HarvardLawyer();
        System.out.print(michael.getHours() + "hrs, ");
        System.out.printf("$%.2f, ", michael.getSalary());
        System.out.print(michael.getVacationDays() + "days, ");
        System.out.println(michael.getVacationForm());
    }
}