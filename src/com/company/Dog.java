package com.company;

public class Dog extends Mammal {
    private String color;
    private String type;
    private String Character;

    public Dog() {

    }

    public Dog(String color, String type, String character) {
        this.color = color;
        this.type = type;
        Character = character;
    }

    public Dog(Long id, String name, double weight, String gender, boolean isPredator, boolean canSwim, String breed, String color, String type, String character) {
        super(id, name, weight, gender, isPredator, canSwim, breed);
        this.color = color;
        this.type = type;
        Character = character;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCharacter() {
        return Character;
    }

    public void setCharacter(String character) {
        Character = character;
    }
}
