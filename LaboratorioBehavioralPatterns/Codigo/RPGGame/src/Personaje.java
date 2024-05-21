import java.util.Random;

public class Personaje {
    private static final int DESCANSANDO = 0;
    private static final int MOVIENDOSE = 1;
    private static final int ENPANICO = 2;
    private static final int ATACANDO = 3;

    private int estadoActual = DESCANSANDO;
    private String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String muevase() {
        String resultado = "";

        switch (estadoActual) {
            case DESCANSANDO:
                estadoActual = MOVIENDOSE;
                resultado = String.format("%s se está moviendo...", nombre);
                break;
            case ATACANDO:
                resultado = String.format("%s necesita primero dejar de atacar para moverse...", nombre);
                break;
            case ENPANICO:
                resultado = String.format("%s se mueve erraticamente en total pánico!!!", nombre);
                break;
            case MOVIENDOSE:
                resultado = String.format("%s ya está moviendo...", nombre);
                break;
        }
        return resultado;
    }

    private String ataque() {
        String resultado = "";

        switch (estadoActual) {
            case DESCANSANDO:
                estadoActual = ATACANDO;
                resultado = String.format("%s está atacando...", nombre);
                break;
            case ATACANDO:
                resultado = String.format("%s está atacando y causando %d en daño...", nombre, new Random().nextInt(20) + 1);
                break;
            case ENPANICO:
                resultado = String.format("%s está atacando pero en pánico y por lo tanto falla sus intentos!!!", nombre);
                break;
            case MOVIENDOSE:
                resultado = String.format("%s no puede atacar mientras está en movimiento...", nombre);
                break;
        }
        return resultado;
    }

    private String detengase() {
        String resultado = "";

        switch (estadoActual) {
            case DESCANSANDO:
                resultado = String.format("%s ya se encuentra detenido descansando...", nombre);
                break;
            case ATACANDO:
                estadoActual = DESCANSANDO;
                resultado = String.format("%s está calmado y descansando...", nombre);
                break;
            case ENPANICO:
                estadoActual = MOVIENDOSE;
                resultado = String.format("%s está relajando pero aún se mueve!!!", nombre);
                break;
            case MOVIENDOSE:
                estadoActual = DESCANSANDO;
                resultado = String.format("%s se detuvo y está quieto...", nombre);
                break;
        }
        return resultado;
    }

    private String corra() {
        String resultado = "";

        switch (estadoActual) {
            case DESCANSANDO:
                resultado = String.format("%s no puede correr a menos que se esté moviendo...", nombre);
                break;
            case ATACANDO:
                estadoActual = MOVIENDOSE;
                resultado = String.format("%s está huyendo de la batalla...", nombre);
                break;
            case ENPANICO:
                resultado = String.format("%s corre en circulos en pánico!!!", nombre);
                break;
            case MOVIENDOSE:
                estadoActual = DESCANSANDO;
                resultado = String.format("%s empieza a correr...", nombre);
                break;
        }
        return resultado;
    }

    private String entreEnPanico() {
        String resultado = "";

        switch (estadoActual) {
            case DESCANSANDO:
            case ATACANDO:
            case ENPANICO:
            case MOVIENDOSE:
                estadoActual = ENPANICO;
                resultado = String.format("%s es presa del pánico y empieza a comportarse paranóico...", nombre);
                break;
        }
        return resultado;
    }

    private String calmese() {
        String resultado = "";

        switch (estadoActual) {
            case DESCANSANDO:
                resultado = String.format("%s ya estaba relajado...", nombre);
                break;
            case ATACANDO:
            case ENPANICO:
            case MOVIENDOSE:
                estadoActual = DESCANSANDO;
                resultado = String.format("%s está relajado y calmado...", nombre);
                break;
        }
        return resultado;
    }

    public void atenderSolicitud(char c) {
        String result;
        switch (Character.toLowerCase(c)) {
            case 'm':
                result = muevase();
                break;
            case 'a':
                result = ataque();
                break;
            case 'd':
                result = detengase();
                break;
            case 'r':
                result = corra();
                break;
            case 'p':
                result = entreEnPanico();
                break;
            case 'c':
                result = calmese();
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
}
