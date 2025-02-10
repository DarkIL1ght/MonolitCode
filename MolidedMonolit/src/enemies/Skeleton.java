package enemies;

import player.Player;

public class Skeleton extends Enemy {

    public Skeleton() {
        super("Skeleton", 50, 10, 20);

    }


    @Override
    public void attack(Player player) {
        player.takeDamage(damage);
    }

}
