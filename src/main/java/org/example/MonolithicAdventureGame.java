package org.example;

public class MonolithicAdventureGame {
    public void playGame(LevelManager level,EnemyManager enemyManager,Player player,ItemManager item){
        while (level.getLevel() <= 3 && player.getHealth() > 0){
            System.out.println("=== Level " + level.getLevel() + " ===");
        }
        while (!enemyManager.getEnemies().isEmpty() && player.getHealth() > 0){
            String enemy = enemyManager.getEnemies().get(0);
            enemyManager.fightEnemy(enemy , player);

        }
       while (player.getHealth() > 0 && !item.GetItems().isEmpty()){
            String items = item.GetItems().get(0);
            item.pickUpItem(items,player);
        }
        if (player.getHealth() > 0 && level.getLevel() < 3){
            level.advanceLevel(enemyManager,item,player);
        }
        if (player.getHealth() <= 0){
            System.out.println(player.getName() + "has perished.Game over!");
        }
        else{
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure with " + player.getExperience() + " experience points!");
        }
    }

}
