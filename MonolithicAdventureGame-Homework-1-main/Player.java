import java.util.List;

public class Player implements Items{
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private List<String> inventory;

    public Player(String playerName, int playerHealth, int playerExperience, List<String> inventory) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerExperience = playerExperience;
        this.inventory = inventory;
    }
}
