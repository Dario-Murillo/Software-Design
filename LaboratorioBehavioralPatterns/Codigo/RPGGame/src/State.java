/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public abstract class State {
  protected static final int DESCANSANDO = 0;
  protected static final int MOVIENDOSE = 1;
  protected static final int ENPANICO = 2;
  protected static final int ATACANDO = 3;
  protected int estadoActual;
  protected Personaje personaje;
  protected String result;

  public Personaje getPersonaje() {
    return personaje;
  }

  public void setPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }

  public abstract String muevase();
  public abstract String ataque();
  public abstract String detengase();
  public abstract String corra();
  public abstract String entreEnPanico();
  public abstract String calmese();
}
