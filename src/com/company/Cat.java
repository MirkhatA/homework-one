package com.company;

public class Cat extends Mammal{
    private String eyeColor;
    private boolean hasClaws;

    public Cat() {

    }

    public Cat(String eyeColor, boolean hasClaws) {
        this.eyeColor = eyeColor;
        this.hasClaws = hasClaws;
    }

    public Cat(Long id, String name, double weight, String gender, boolean isPredator, boolean canSwim, String breed, String eyeColor, boolean hasClaws) {
        super(id, name, weight, gender, isPredator, canSwim, breed);
        this.eyeColor = eyeColor;
        this.hasClaws = hasClaws;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }
}
