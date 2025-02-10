package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnemyManager implements IEnemyManager{
    List<String> enemies;
    public EnemyManager(){
        this.enemies = new ArrayList<>();
        enemies.add("Zombie");
        enemies.add("Skeleton");
    }
    public void AddEnemy(String enemies){
        this.enemies.add(enemies);
    }

    @Override
    public List<String> getEnemies(){
        return this.enemies;
    }
    @Override
    public void fightEnemy(String enemy,Player player){
        if (enemy.equals("Zombie")){
            player.damage(10);
        } else if (enemy.equals("Skeleton")) {
            player.damage(15);
        }
        enemies.remove(enemy);
    }

}
