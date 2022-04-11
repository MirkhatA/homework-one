package com.animals;

public class Bird extends Animal{
    private boolean isFlyable;
    private boolean canEat;
    private String beakColor;

    public Bird() {

    }

    public Bird(boolean isFlyable, boolean canEat, String beakColor) {
        this.isFlyable = isFlyable;
        this.canEat = canEat;
        this.beakColor = beakColor;
    }

    public Bird(Long id, String name, double weight, String gender, boolean isFlyable, boolean canEat, String beakColor) {
        super(id, name, weight, gender);
        this.isFlyable = isFlyable;
        this.canEat = canEat;
        this.beakColor = beakColor;
    }

    public boolean isFlyable() {
        return isFlyable;
    }

    public void setFlyable(boolean flyable) {
        isFlyable = flyable;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }
}
