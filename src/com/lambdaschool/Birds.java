package com.lambdaschool;

public class Birds extends AbstractAnimal {
    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
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
