package com.lambdaschool;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "walked";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getYearDiscovered() {
        return super.getYearDiscovered();
    }

    @Override
    public void setYearDiscovered(int yearDiscovered) {
        super.setYearDiscovered(yearDiscovered);
    }

    @Override
    public int getId() {
        return super.getId();
    }
}
