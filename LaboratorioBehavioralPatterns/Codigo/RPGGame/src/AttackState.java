import java.util.Random;

public class AttackState extends State{

  public AttackState(State state) {
    this.personaje = state.getPersonaje();
  }

  @Override
  public String muevase() {
    result = String.format("%s necesita primero dejar de atacar para moverse...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String ataque() {
    result = String.format("%s está atacando y causando %d en daño...", personaje.getNombre(), new Random().nextInt(20) + 1);
    StateChangeCheck();
    return result;
  }

  @Override
  public String detengase() {
    estadoActual = DESCANSANDO;
    result = String.format("%s está calmado y descansando...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String corra() {
    estadoActual = MOVIENDOSE;
    result = String.format("%s está huyendo de la batalla...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String entreEnPanico() {
    StateChangeCheck();
    return "";
  }

  @Override
  public String calmese() {
    StateChangeCheck();
    return "";
  }

  private void StateChangeCheck() {
    if(estadoActual == DESCANSANDO) {
      personaje.setState(new RestingState(this));
    }else if( estadoActual == MOVIENDOSE) {
      personaje.setState(new MovingState(this));
    }else if (estadoActual == ENPANICO) {
      personaje.setState(new PanicState(this));
    }
  }
  
}
