package com.company;
import java.util.Random;

public class Developer extends Manager {
    private int fixedBugs;
    private final double defaultBugRate = 400.5;

    Developer() {
        super();
        fixedBugs = 0;
    }

    @Override
    public double countSalary() {
        Random random = new Random();
        return (this.getSalary() + fixedBugs*defaultBugRate) * random.nextInt(2);
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

}
