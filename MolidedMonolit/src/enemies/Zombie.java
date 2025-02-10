package enemies;

import player.Player;
public class Zombie extends Enemy {
    public Zombie() {
        super("Zombie", 70, 15, 30);
    }

    @Override
    public void attack(Player player) {
        player.takeDamage(damage);
    }
}
