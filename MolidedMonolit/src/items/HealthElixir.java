package items;

import player.Player;

public class HealthElixir extends Item {
    public HealthElixir() {
    }

    public HealthElixir(Player player) {
        super("Health Elixir", player);
    }

    @Override
    public void use() {
        player.setPlayerHealth(100);
        System.out.println(player.getPlayerName() + " использовал эликсир и вылечился");
    }
}