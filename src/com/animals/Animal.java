package com.animals;

public class Animal {
    private Long id;
    private String name;
    private double weight;
    private String gender;

    public Animal() {

    }

    public Animal(Long id, String name, double weight, String gender) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
