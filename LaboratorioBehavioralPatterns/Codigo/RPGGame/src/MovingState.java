/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class MovingState extends State {

  public MovingState(State state) {
    this.personaje = state.getPersonaje();
  }

  @Override
  public String muevase() {
    result = String.format("%s ya está moviendo...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String ataque() {
    result = String.format("%s no puede atacar mientras está en movimiento...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String detengase() {
    estadoActual = DESCANSANDO;
    result = String.format("%s se detuvo y está quieto...", personaje.getNombre());
    StateChangeCheck();
    return result;
    
  }

  @Override
  public String corra() {
    estadoActual = DESCANSANDO;
    result = String.format("%s empieza a correr...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String entreEnPanico() {
    estadoActual = ENPANICO;
    result = String.format("%s es presa del pánico y empieza a comportarse paranóico...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String calmese() {
    estadoActual = DESCANSANDO;
    result = String.format("%s está relajado y calmado...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  private void StateChangeCheck() {
    if (estadoActual == DESCANSANDO) {
      personaje.setState(new RestingState(this));
    } else if ( estadoActual == ENPANICO) {
      personaje.setState(new PanicState(this));
    } else if (estadoActual == ATACANDO) {
      personaje.setState(new AttackState(this));
    }
  }
}
