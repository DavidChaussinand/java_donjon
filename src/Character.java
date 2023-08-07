public abstract class Character {




    private String name;
    private int levelOfLife;
    private int attackForce;

    public Character (String name, int levelOfLife, int attackForce ){
        this.name = name;
        this.levelOfLife = levelOfLife;
        this.attackForce = attackForce;
    }
    public Character (String name){
        this();
        this.name = name;

    }
    public Character() {
        this.name = "ragnard";
        this.levelOfLife = 5;
        this.attackForce= 5;
    }



    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", levelOfLife=" + levelOfLife +
                ", attackForce=" + attackForce +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelOfLife() {
        return levelOfLife;
    }

    public void setLevelOfLife(int levelOfLife) {
        this.levelOfLife = levelOfLife;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

}
