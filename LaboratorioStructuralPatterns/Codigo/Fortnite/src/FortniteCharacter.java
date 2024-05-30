public abstract class FortniteCharacter {
    protected int health;
    public FortniteCharacter(int health) {
        this.health = health;
    }
    protected abstract void attack(FortniteCharacter target);
    protected void reduceHealth(int subtract){
        health -= subtract;
        

        if (health <= 0){
            System.out.println(getClass().getSimpleName() + " is out of the game");
        }
        else{
            System.out.println(getClass().getSimpleName() + " health was reduced to " + health);
        }
    }
}
