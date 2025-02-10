package items;

import player.Player;
import java.util.List;

public class ItemManager {
    private Player player;
    private List<Item> items;

    public ItemManager(Player player, List<Item> items) {
        this.player = player;
        this.items = items;
    }

    public void pickUpItem(Item item) {
        System.out.println(player.getPlayerName() + " подбирает " + item.getName() + ".");
        item.use();
        player.pickUpItem(item.getName());
        items.remove(item);
    }
}