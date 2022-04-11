package com.animals;

public class Mammal extends Animal {
    private boolean isPredator;
    private boolean canSwim;
    private String breed;

    public Mammal() {

    }

    public Mammal(boolean isPredator, boolean canSwim, String breed) {
        this.isPredator = isPredator;
        this.canSwim = canSwim;
        this.breed = breed;
    }

    public Mammal(Long id, String name, double weight, String gender, boolean isPredator, boolean canSwim, String breed) {
        super(id, name, weight, gender);
        this.isPredator = isPredator;
        this.canSwim = canSwim;
        this.breed = breed;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
