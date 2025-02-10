package org.example;

public class MonolithicAdventureGame {
    public void playGame(LevelManager level, IEnemyManager enemyManager, Player player, IItemManager itemManager) {
        while (level.getLevel() <= 3 && player.getHealth() > 0) {
            System.out.println("=== Level " + level.getLevel() + " ===");

            while (!enemyManager.getEnemies().isEmpty() && player.getHealth() > 0) {
                String enemy = enemyManager.getEnemies().get(0);
                enemyManager.fightEnemy(enemy, player);
            }

            while (player.getHealth() > 0 && !itemManager.GetItems().isEmpty()) {
                String item = itemManager.GetItems().get(0);
                itemManager.pickUpItem(item, player);
            }

            if (player.getHealth() > 0 && level.getLevel() < 3) {
                level.advanceLevel(enemyManager, itemManager, player);
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has perished. Game over!");
        } else {
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure with " + player.getExperience() + " experience points!");
        }
    }
}
