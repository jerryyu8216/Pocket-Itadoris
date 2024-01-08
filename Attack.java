public class Attack {

    private String name; // name of attack
    private String description; // describes effects of attack beyond damage
    private boolean isSpecial; // is the attack a special attack or not
    private int damage; // value from 0 - 100 in increments of 5
    private int healing; // value from 0 - 100 in increments of 5
    private String type; // physical, special, status

    public Attack(String name, String description, boolean isSpecial, int damage, int healing, String type) {
        this.name = name;
        this.description = description;
        this.isSpecial = isSpecial;
        this.damage = damage;
        this.healing = healing;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean getIsSpecial() {
        return isSpecial;
    }
    public int getDamage() {
        return damage;
    }
    public int getHealing() {
        return healing;
    }
    public String getType() {
        return type;
    }
}