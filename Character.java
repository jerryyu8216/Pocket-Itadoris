package PocketItadoris;

public class Character {
    private int characterId; // id of Character
    private String name; // Character Name
    private int level;
    private Attack [] learnableAttacks; // All attacks a character can learn
    private Attack[] equippedAttacks; // Array of attacks currently equipped
    private Attack specialAttack; // Special attack currently equipped
    private int attack; // Character's Attack stat 0 - 100
    private int defense; // Character's Defense stat 0 - 100
    private int speed; // Character's Speed stat 0 - 100
    private int hp; // Character's Hp stat 0 - 100
    private int energy; // Character's energy stat 0 - energyLimit
    private int energyLimit; // Character's max amount of energy allowed 0 - 100
    private int energyRegainRate; // Character's energy regain rate per turn
    private Ability ability; // Charter's Equipped special ability

    public Character(int characterId, String name, int level, Attack[] learnableAttacks, Attack[] equippedAttacks, Attack specialAttack, int attack, int defense, int speed, int hp, int energyLimit, int energyRegainRate, Ability ability){
        this.characterId = characterId;
        this.name = name;
        this.level = level;
        this.learnableAttacks = learnableAttacks;
        this.equippedAttacks = equippedAttacks;
        this.specialAttack = specialAttack;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.hp = hp;
        this.energy = 0;
        this.energyLimit = energyLimit;
        this.energyRegainRate = energyRegainRate;
        this.ability = ability;
    }
    public int getCharacterId() {
        return characterId;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public Attack[] getLearnableAttacks(){
        return learnableAttacks;
    }
    public Attack[] getEquippedAttacks(){
        return equippedAttacks;
    }
    public void setEquippedAttacks(Attack[] equippedAttacks){
        this.equippedAttacks = equippedAttacks;
    }
    public Attack getSpecialAttack(){
        return specialAttack;
    }
    public void setSpecialAttack(Attack specialAttack){
        this.specialAttack = specialAttack;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getEnergyLimit() {
        return energyLimit;
    }
    public void setEnergyLimit(int energyLimit){
        this.energyLimit = energyLimit;
    }
    public int getEnergyRegainRate() {
        return energyRegainRate;
    }
    public void setEnergyRegainRate(int energyRegainRate){
        this.energyRegainRate = energyRegainRate;
    }
    public Ability getAbility(){
        return ability;
    }

}
