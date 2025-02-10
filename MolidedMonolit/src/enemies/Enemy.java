package enemies;

import player.Player;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int damage;
    protected int experience;


    public Enemy(String name, int health, int damage, int experience) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.experience = experience;
    }

    public abstract void attack(Player player);

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }


}