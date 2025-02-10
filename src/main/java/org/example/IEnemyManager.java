package org.example;
import java.util.List;
public interface IEnemyManager {
    List<String> getEnemies();
    void fightEnemy(String enemy, Player player);
}
