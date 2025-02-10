package player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private int gold;
    private List<String> inventory;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHealth = 100;
        this.playerExperience = 0;
        this.inventory = new ArrayList<>();
        this.gold = 0;
    }

    public void takeDamage(int damage) {
        this.playerHealth -= damage;
        System.out.println(playerName + " получил урон " + damage + ". Осталось здоровья: " + playerHealth);
    }

    public void gainExperience(int xp) {
        this.playerExperience += xp;
        System.out.println(playerName + " получил " + xp + " опыта. Текущий опыт: " + playerExperience);
    }

    public void pickUpItem(String item) {
        inventory.add(item);
        System.out.println(playerName + " подобрал " + item + ". Инвентарь: " + inventory);
    }

    public boolean isAlive() {
        return playerHealth > 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }
    public List<String> getInventory() {
        return inventory;
    }
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
