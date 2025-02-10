package enemies;

import player.Player;

public class Vampire extends Enemy {
    int score;
    public Vampire() {
        super("Vampire", 100, 25, 50);

    }




    @Override
    public void attack(Player player) {
        player.takeDamage(damage);
    }
}
