public class App {
    public static void main(String[] args) throws Exception {
        RemoteControl remote = new RemoteControl();
        /* ToDo: Aquí debe ir su código para crear los comandos y hacer el set en el objecto remote */

        System.out.printf(remote.toString());
        System.out.printf("executing on button [0] click\n");
        System.out.printf(remote.onButtonWasPushed(0));
        System.out.printf("executing off button [0] click\n");
        System.out.printf(remote.offButtonWasPushed(0));
    }
}
