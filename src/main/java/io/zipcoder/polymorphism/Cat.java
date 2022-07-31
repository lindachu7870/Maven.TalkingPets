package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name, String type) {
        super(name, type);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super.name = "Cat name";
        super.type = "cat";
    }

    public String speak() {
        return "Meow!";
    }
}
