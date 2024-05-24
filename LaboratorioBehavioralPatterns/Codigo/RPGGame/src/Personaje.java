import java.util.Random;

public class Personaje {
    private State state;
    private String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.state = new RestingState(this);
    }

    public void atenderSolicitud(char c) {
        String result;
        switch (Character.toLowerCase(c)) {
            case 'm':
                result = state.muevase();
                break;
            case 'a':
                result = state.ataque();
                break;
            case 'd':
                result = state.detengase();
                break;
            case 'r':
                result = state.corra();
                break;
            case 'p':
                result = state.entreEnPanico();
                break;
            case 'c':
                result = state.calmese();
                break;
            case 'e':
                result = "Gracias por jugar el juego \"RPC\"";
                break;
            default:
                result = "Solicitud desconocida, intente de nuevo...";
                break;
        }

        System.out.println(result);
    }

    public String getNombre() {
        return nombre;
    }

    public void setState(State state) {
        this.state = state;
    }
}
