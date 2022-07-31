package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(String name, String type) {
        super(name, type);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super.name = "Dog name";
        super.type = "dog";
    }

    public String speak() {
        return "Woof!";
    }
}
