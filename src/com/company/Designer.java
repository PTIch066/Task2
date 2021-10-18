package com.company;

public class Designer extends Manager {
    private double rate;
    private int workedDays;

    Designer() {
        super();
        rate = 0;
        workedDays = 0;
    }

    @Override
    public double countSalary() {
        return this.getSalary() + rate * workedDays;
    }

    public double getRate() {
        return rate;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

}
