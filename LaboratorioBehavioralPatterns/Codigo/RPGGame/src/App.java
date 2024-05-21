import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Personaje personaje = new Personaje("Hombre Lobo");

        char command = ' ';
        System.out.println("Bienvenido al juego del Patrón de Estado!");
        System.out.printf("Su personaje %s se encuentra relajado y listo para empezar!\n", personaje.getNombre());

        Scanner scanner = new Scanner(System.in);
        while (Character.toLowerCase(command) != 'e') {
            System.out.println("\nQué quiere hacer ahora?");
            System.out.print("   Moverse(m)    Atacar(a)    Detenerse(d)    Correr(r)    Entrar en Pánico (p)    Calmarse(c)    Salir(e): ==> ");
            String choice = scanner.nextLine();
            if (!choice.isEmpty()) {
                command = choice.toLowerCase().charAt(0);
                personaje.atenderSolicitud(command);
            }
        }
        scanner.close();

    }
}
