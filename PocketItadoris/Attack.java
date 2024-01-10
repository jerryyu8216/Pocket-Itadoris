package PocketItadoris;
public class Attack {
    private int attackId;
    private String name; // name of attack
    private String description; // describes effects of attack beyond damage
    private int damage; // value from 0 - 100 in increments of 5
    private int healing; // value from 0 - 100 in increments of 5
    private int cost; // value from 0 - 100 in increments of 5, energy cost of attack
    private String type; // basic, special, status

    public Attack(int attackId, String name, String description, int damage, int healing, int cost, String type) {
        this.attackId = attackId;
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.healing = healing;
        this.cost = cost;
        this.type = type;
    }
    public int getAttackId() {
        return attackId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealing() {
        return healing;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setHealing(int healing) {
        this.healing = healing;
    }
    public String getType() {
        return type;
    }
}