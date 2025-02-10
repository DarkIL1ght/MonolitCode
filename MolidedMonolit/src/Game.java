import player.Player;
import combat.CombatManager;
import items.ItemManager;
import level.*; // Импорт пакета level
import items.Item;
import enemies.*;

public class Game {
    private Player player;
    private CombatManager combatManager;
    private ItemManager itemManager;
    public LevelManager levelManager;

    public Game() {
        this.player = new Player("Герой");
        this.levelManager = new LevelManager();
        this.combatManager = new CombatManager(player, levelManager.getEnemies());
        this.itemManager = new ItemManager(player, levelManager.getItems());
    }

    public void playGame() {
        while (levelManager.getLevel() <= 3 && player.isAlive()) {
            System.out.println("=== Уровень " + levelManager.getLevel() + " ===");

            while (!levelManager.getEnemies().isEmpty() && player.isAlive()) {
                combatManager.fightEnemy(levelManager.getEnemies().get(0));
            }

            while (!levelManager.getItems().isEmpty() && player.isAlive()) {
                itemManager.pickUpItem(levelManager.getItems().get(0));
            }

            if (player.isAlive() && levelManager.getLevel() < 3) {
                levelManager.advanceLevel();
            }
        }

        if (!player.isAlive()) {
            System.out.println(player.getPlayerName() + " погиб. Игра окончена.");
        } else {
            System.out.println("Поздравляем, " + player.getPlayerName() + "! Вы прошли игру с "
                    + player.getPlayerExperience() + " очками опыта!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}