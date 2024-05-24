public class PanicState extends State {

  public PanicState(State state) {
    this.personaje = state.getPersonaje();
  }

  @Override
  public String muevase() {
    result = String.format("%s se mueve erraticamente en total pánico!!!", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String ataque() {
    result = String.format("%s está atacando pero en pánico y por lo tanto falla sus intentos!!!", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String detengase() {
    estadoActual = MOVIENDOSE;
    result = String.format("%s está relajando pero aún se mueve!!!", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String corra() {
    result = String.format("%s corre en circulos en pánico!!!", personaje.getNombre());
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
    }else if (estadoActual == ATACANDO) {
      personaje.setState(new AttackState(this));
    }
  }
  
}