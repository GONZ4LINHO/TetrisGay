package battle2023.ucp;

public abstract class militaryAsset {
    
    public militaryAsset(String name, int health) {
        this.name = name;
        this.health = health;
    }

    private int health = 5;

    protected String name;

    protected void setHealth(int value){
        health=value;
    }

    protected int getHealth(){
        return health;
    }

    protected void setName(String value){
        name=value;
    }

    protected String getName(){
        return name;
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    protected void damage(int amount) {
        setHealth( getHealth() - amount);
        return;
    }

    public void repair(int amount){
        setHealth(getHealth() + amount);
        return;
    } 
}