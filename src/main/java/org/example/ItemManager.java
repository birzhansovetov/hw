package org.example;

import java.util.ArrayList;
import java.util.List;

public class ItemManager implements IItemManager {
    private List<String> item;
    private List<String> inventory;
    public ItemManager(){
        this.inventory = new ArrayList<>();
        this.item = new ArrayList<>();
        item.add("Gold Coin");
        item.add("Health Elixir");
    }
    public void AddItem(String item){
        this.item.add(item);
    }
    @Override
    public List<String> GetItems(){
        return this.item;
    }
    public void useItem(String item){
        this.item.remove(item);
    }
    public List<String> GetInventory(){
        return this.inventory;
    }

    @Override
    public void pickUpItem(String item,Player player){

        if (item.equals("Gold Coin")){
            player.addExperience(5);
        } else if (item.equals("Health Elixir")) {
            player.heal(20);
        } else if (item.equals("Magic Scroll")) {
            player.addExperience(15);
        }
        if (!this.inventory.contains(item)) {
            inventory.add(item);
        }
    }

}
