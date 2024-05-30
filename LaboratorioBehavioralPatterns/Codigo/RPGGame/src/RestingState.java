/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class RestingState extends State {

  public RestingState(State state) {
    this(state.getPersonaje());
  } 

  public RestingState(Personaje personaje) {
    this.personaje = personaje;
  }

  @Override
  public String muevase() {
    estadoActual = MOVIENDOSE;
    result = String.format("%s se está moviendo...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String ataque() {
    estadoActual = ATACANDO;
    result = String.format("%s está atacando...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String detengase() {
    result = String.format("%s ya se encuentra detenido descansando...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String corra() {
    result = String.format("%s no puede correr a menos que se esté moviendo...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String entreEnPanico() {
    estadoActual = ENPANICO;
    result = String.format("%s entro en pánico!!!...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }

  @Override
  public String calmese() {
    result = String.format("%s ya estaba relajado...", personaje.getNombre());
    StateChangeCheck();
    return result;
  }
  
  private void StateChangeCheck() {
    if (estadoActual == ATACANDO) {
      personaje.setState(new AttackState(this));
    } else if ( estadoActual == MOVIENDOSE) {
      personaje.setState(new MovingState(this));
    } else if (estadoActual == ENPANICO) {
      personaje.setState(new PanicState(this));
    }
  }
}
