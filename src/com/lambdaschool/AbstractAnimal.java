package com.lambdaschool;

public abstract class AbstractAnimal {
    static int maxId = 0;
    int id;
    String name;
    int yearDiscovered;

    public AbstractAnimal(String name, int yearDiscovered){
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    public void eat(){
        System.out.println("it ate");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    public int getId() {
        return id;
    }

}
