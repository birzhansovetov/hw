package org.example;

public class LevelManager {
    private int level;
    public LevelManager(){
        this.level = 1;
    }
    public int getLevel(){
        return this.level;
    }
    public void advanceLevel(IEnemyManager enemy, IItemManager item, Player player){
        this.level++;
        player.heal(100);
        enemy.getEnemies().clear();
        item.GetItems().clear();
        if (level == 2){
            enemy.getEnemies().add("Vampire");
            item.GetItems().add("Magic Scroll");
        } else if (level == 3) {
            enemy.getEnemies().add("Vampire");
            enemy.getEnemies().add("Spider");
            item.GetItems().add("Health Elixir");
            item.GetItems().add("Gold Coin");
        }
        System.out.println("Reached level" + level);
    }
}
