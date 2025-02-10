package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Adventurer");
        EnemyManager enemyManager = new EnemyManager();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();

        MonolithicAdventureGame game = new MonolithicAdventureGame();
        game.playGame(levelManager, enemyManager, player, itemManager);
    }
}