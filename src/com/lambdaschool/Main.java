package com.lambdaschool;

import java.util.ArrayList;

public class Main {
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester){
        for (AbstractAnimal a : animals){
            if (tester.test(a)){
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        ArrayList<AbstractAnimal> animalsList = new ArrayList<AbstractAnimal>();
        animalsList.add(new Mammals("Panda", 1869));
        animalsList.add(new Mammals("Zebra", 1778));
        animalsList.add(new Mammals("Kola", 1816));
        animalsList.add(new Mammals("Sloth", 1804));
        animalsList.add(new Mammals("Armadillo", 1758));
        animalsList.add(new Mammals("Raccoon", 1758));
        animalsList.add(new Mammals("Bigfoot", 2021));
        animalsList.add(new Birds("Pigeon", 1837));
        animalsList.add(new Birds("Peacock", 1821));
        animalsList.add(new Birds("Toucan", 1758));
        animalsList.add(new Birds("Parrot", 1824));
        animalsList.add(new Birds("Swan", 1758));
        animalsList.add(new Fish("Salmon", 1758));
        animalsList.add(new Fish("Catfish", 1817));
        animalsList.add(new Fish("Perch", 1758));

        //List all the animals in descending order by year named
        System.out.println("** desc order by year **\n");
        animalsList.sort((v1, v2) -> v1.getYearDiscovered() - v2.getYearDiscovered());
        animalsList.forEach((v) -> System.out.println(v.getName()));

        //List all the animals alphabetically
        System.out.println("** all alphabetically **\n");
        animalsList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalsList.forEach((v) -> System.out.println(v.getName()));

        //List all the animals order by how they move
        System.out.println("\n** order by movement **\n");
        animalsList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        animalsList.forEach((v) -> System.out.println(v.getName()));

        //List only those animals the breath with lungs
        System.out.println("\n** animals that breath w/ lungs **");
        printAnimals(animalsList, a -> ((a.breath().equals("lungs"))));

        //List only those animals that breath with lungs and were named in 1758
        System.out.println("\n*** breath with lungs and named in 1758 **\n");
        printAnimals(animalsList, a -> ((a.breath().equals("lungs")) && (a.getYearDiscovered() == 1758)));

        //List only those animals that lay eggs and breath with lungs
        System.out.println("\n*** lay eggs and breath with lungs ***\n");
        printAnimals(animalsList, a -> ((a.breath().equals("lungs")) && (a.reproduce().equals("eggs"))));

        //List alphabetically only those animals that were named in 1758
        System.out.println("\n** animals alphabetically named in 1758 **\n");
        animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalsList, a -> (a.getYearDiscovered() == 1758));
    }
}
