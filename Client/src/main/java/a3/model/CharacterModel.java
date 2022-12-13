package a3.model;

public class CharacterModel {
    private String Name;
    private String Status;
    private float Health;
    private int DefenseCounter;
    private int HealingCounter;
    private boolean ForfeitStatus;

    public CharacterModel() {}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public float getHealth() {
        return Health;
    }

    public void setHealth(float health) {
        Health = health;
    }

    public int getDefenseCounter() {
        return DefenseCounter;
    }

    public void setDefenseCounter(int defenseCounter) {
        DefenseCounter = defenseCounter;
    }

    public int getHealingCounter() {
        return HealingCounter;
    }

    public void setHealingCounter(int healingCounter) {
        HealingCounter = healingCounter;
    }

    public boolean isForfeitStatus() {
        return ForfeitStatus;
    }

    public void setForfeitStatus(boolean forfeitStatus) {
        ForfeitStatus = forfeitStatus;
    }
}
