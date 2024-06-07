public class MarioAdaptador extends FortniteCharacter {

  Mario mario = new Mario();

  public MarioAdaptador(int health) {
    super(health);
  }

  @Override
  protected void attack(FortniteCharacter target) {
    target.reduceHealth(mario.jumpAttack());
  }
  
}
