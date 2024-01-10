package PocketItadoris;

public class Player{
	
    private int playerId; // id of Character
    private String name; // Character Name
    private int level;
    private Character[] ownedCharacter; // All attacks a character can learn
    private Character[] team; // Characters currently active in game

    // creates new player profile
    public Player(int playerId, String name){
        this.playerId = playerId;
        this.name = name;
        this.level = 0;
        this.ownedCharacter = null;
        this.team = null;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character[] getOwnedCharacter() {
        return ownedCharacter;
    }

    public void setOwnedCharacter(Character[] ownedCharacter) {
        this.ownedCharacter = ownedCharacter;
    }

    public Character[] getTeam() {
        return team;
    }

    public void setTeam(Character[] team) {
        this.team = team;
    }

    
}
