package org.example;

public class LevelManager {
    private int level;
    public LevelManager(){
        this.level = 1;
    }
    public int getLevel(){
        return this.level;
    }
    public void advanceLevel(EnemyManager enemy,ItemManager item,Player player){
        this.level++;
        player.heal(100);
        enemy.getEnemies().clear();
        item.GetItems().clear();
        if (level == 2){
            enemy.enemies.add("Vampire");
            item.AddItem("Magic Scroll");
        } else if (level == 3) {
            enemy.enemies.add("Vampire");
            enemy.enemies.add("Spider");
            item.AddItem("Health Elixir");
            item.AddItem("Gold Coin");
        }
        System.out.println("Reached level" + level);
    }
}
