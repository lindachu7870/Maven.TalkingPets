package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    List<Pet> petHouse = new ArrayList<>();

    public void runApp() {
        Console console = new Console(System.in, System.out);

        Integer input = console.getIntegerInput("Please enter the amount of pets you have:");
        int count = 1;

        while (count <= input) {
            String type;
            String name;

            while(true) {
                String typeInput = console.getStringInput(String.format("What type of pet is Pet #%s", count));

                if(typeInput.equals("cat") || typeInput.equals("dog")) {
                    type = typeInput;
                    break;
                }

                System.out.println("Invalid. Please try again.");
            }

            name = console.getStringInput(String.format("What name of pet is Pet #%s", count));

            petHouse.add(matchType(name, type));
            count++;
        }

        for(Pet pet : petHouse ) {
            System.out.println(String.format("%s says %s!", pet.getName(), pet.speak()));
        }
    }

    public Pet matchType(String name, String type) {
        switch (type) {
            case "cat":
                return createCat(name, type);
            case "dog":
                return createDog(name, type);
            default:
                System.out.println("Invalid. Please try again.");
        }
        return null;
    }

    public Cat createCat(String name, String type) {
        return new Cat(name, type);
    }

    public Dog createDog(String name, String type) {
        return new Dog(name, type);
    }

}
