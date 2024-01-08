package PocketItadoris;

public class Ability {
    private String name;
    private String description;
    private String[] effects;

    public Ability(String name, String description, String[] effects) {
        this.name = name;
        this.description = description;
        this.effects = effects;
    }
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String[] getEffects(){
        return effects;
    }
}
