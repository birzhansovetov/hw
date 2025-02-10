package org.example;
import java.util.List;

public interface IItemManager {
    List<String> GetItems();
    void pickUpItem(String item, Player player);
}
