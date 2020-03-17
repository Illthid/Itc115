package com.company;

/*A class to represent Janitor
 * 80hrs/week; twice as many hours per week as general employees
 * $30,000; $10,000 less than general employees
 * 5days; half as much vacation as general employees
 * print "Workin' for the man."
 *
 * 3/17/2020
 *David Barnette
 */

public class Janitor extends Employee {
    public int getHours() {
        return super.getHours() * 2;
    }

    public double getSalary() {
        return super.getSalary() - 10000;
    }

    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    public String getVacationForm() {
        return "Workin' for the man.";
    }

}