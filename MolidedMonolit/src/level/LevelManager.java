import items.*;
import enemies.*;
import player.Player;
import java.util.List;
import java.util.ArrayList;

public class LevelManager {
    private int level;
    private List<Enemy> enemies;
    private List<Item> items;

    public LevelManager() {
        this.level = 1;
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
        initializeLevel();
    }

    private void initializeLevel() {
        enemies.clear();
        items.clear();

        if (level == 1) {
            enemies.add(new Skeleton());
            enemies.add(new Zombie());
            items.add(new GoldCoin());
            items.add(new HealthElixir());
        } else if (level == 2) {
            enemies.add(new Zombie());
            enemies.add(new Vampire());
            items.add(new MagicScroll());
        } else if (level == 3) {
            enemies.add(new Vampire());
        }
    }

    public int getLevel() {
        return level;
    }

    public void advanceLevel() {
        if (level < 3) {
            level++;
            initializeLevel(); // Пересоздаём врагов и предметы при переходе на новый уровень
        }
    }

    public List<Enemy> getEnemies() {
        return new ArrayList<>(enemies); // Возвращаем копию списка, чтобы избежать изменений извне
    }

    public List<Item> getItems() {
        return new ArrayList<>(items); // Возвращаем копию списка
    }
}
