package items;

import player.Player;

public class GoldCoin extends Item {
    public GoldCoin() {
    }

    public GoldCoin(Player player) {
        super("Gold Coin", player);
    }

    @Override
    public void use() {
        player.setGold(player.getGold() + 5);
        System.out.println(player.getPlayerName() + " получил 5 золота. Всего золота: " + player.getGold());
    }
}
