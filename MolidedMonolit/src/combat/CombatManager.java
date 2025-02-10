package combat;

import player.Player;
import enemies.Enemy;


import java.util.List;

public class CombatManager {

    private Player player;
    private List<Enemy> enemies;

    public CombatManager(Player player, List<Enemy> enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public void fightEnemy(Enemy enemy) {
        System.out.println(player.getPlayerName() + " вступает в бой с " + enemy.getName() + "!");
        enemy.attack(player);
        player.gainExperience(enemy.getExperience());
        System.out.println("После боя: Здоровье = " + player.getPlayerHealth() + ", Опыт = " + player.getPlayerExperience());
        enemies.remove(enemy);
    }
}