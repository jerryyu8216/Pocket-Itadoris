package PocketItadoris;

public class Ability {
    private int abilityId;
    private String name;
    private String description;

    public Ability(int abilityId, String name, String description) {
        this.abilityId = abilityId;
        this.name = name;
        this.description = description;
    }
    public int getAbilityId(){
        return abilityId;
    }
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
}
