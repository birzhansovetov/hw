package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnemyManager {
    List<String> enemies;
    public EnemyManager(){
        this.enemies = new ArrayList<>();
        enemies.add("Zombie");
        enemies.add("Skeleton");
    }
    public void AddEnemy(String enemies){
        this.enemies.add(enemies);
    }

    public List<String> GetEnemies(){
        return this.enemies;
    }
    public void fightEnemy(String enemy,Player player){
        if (enemy.equals("Zombie")){
            player.damage(10);
        } else if (enemy.equals("Skeleton")) {
            player.damage(15);
        }
        enemies.remove(enemy);
    }

}
