package items;

import player.Player;

public abstract class Item {
    protected String name;
    protected Player player;

    public Item() {
    }

    public Item(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    public abstract void use();

    public String getName() {
        return name;
    }
}