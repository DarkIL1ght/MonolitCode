package items;

import combat.CombatManager;
import player.Player;

public class MagicScroll extends Item {
    public MagicScroll() {
    }

    public MagicScroll(Player player) {
        super("Magic Scroll", player);
    }

    @Override
    public void use() {
        // Логика для MagicScroll
        System.out.println("Игрок увеличил получение опыта в 2 раза в течений уровня");
    }
}