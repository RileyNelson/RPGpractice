public class Entity {
    private int maxHp;
    private int totalDamageReceived;
    private String resource;
    // 0 - Char 1 - Dex 2 - Int 3 - Perception 4 - Str 5 - Vit
    private int[] stats;
    private boolean attackable;

    public Entity(int maxHp, int totalDamageReceived, String resource, int[] stats, boolean attackable) {
        this.maxHp = maxHp;
        this.totalDamageReceived = totalDamageReceived;
        this.resource = resource;
        this.stats = stats;
        this.attackable = attackable;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public void setMaxHp(int newMaxHp) {
        this.maxHp = newMaxHp;
    }

    public int getTotalDamageReceived() {
       return this.totalDamageReceived;
    }

    public void setTotalDamageReceived(int totalDamageReceived){
        this.totalDamageReceived += totalDamageReceived;
    }

    public String getResource(){
        return this.resource;
    }

    public void setResource( String newResource){
        this.resource = newResource;
    }

    public int getCharisma() {
        return this.stats[0];
    }

    public void setCharisma(int newChar) {
        this.stats[0] = newChar;
    }

    public int getDexterity() {
        return this.stats[1];
    }

    public void setDexterity(int newDex) {
        this.stats[1] = newDex;
    }

    public int getIntellect() {
        return this.stats[2];
    }

    public void setIntellect(int newIntellect) {
        this.stats[2] = newIntellect;
    }

    public int getPerception() {
        return this.stats[3];
    }

    public void setPerception(int newPercept) {
        this.stats[3] = newPercept;
    }

    public int getStrength() {
        return this.stats[4];
    }

    public void setStrength(int newStr) {
        this.stats[4] = newStr;
    }

    public int getVitality() {
        return this.stats[5];
    }

    public void setVitality(int newVit) {
        this.stats[5] = newVit;
    }

    public String toString() {
        return "hp: " + getMaxHp() + " resource " + getResource();
    }
}