package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private  int health;
    private int experience;
    private List<String> Inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.Inventory = new ArrayList<>();
    }
    public void heal(int amount){
        this.health += amount;
        if (this.health > 100){
            this.health = 100;
        }
    }
    public void damage(int amount){
        this.health -= amount;
        if (this.health < 0){
            this.health = 0;
        }
    }
    public void addExperience(int amount){
        this.experience += amount;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public List<String> getInventory() {
        return Inventory;
    }

    public int getHealth() {
        return health;
    }
}
