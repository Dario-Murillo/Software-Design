/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class App {
    public static void main(String[] args) throws Exception {
        RemoteControl remote = new RemoteControl();
        /* ToDo: Aquí debe ir su código para crear los comandos y hacer el set en el objecto remote */
        remote.setCommand(0, new GarageDoorUpCommand(new GarageDoor()), new GarageDoorDownCommand(new GarageDoor()));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [0] click\n");
        System.out.printf(remote.onButtonWasPushed(0));
        System.out.printf(" executing off button [0] click\n");
        System.out.printf(remote.offButtonWasPushed(0));

        remote.setCommand(1, new GaraDoorLightOn(new GarageDoor()), new GarageDoorLightOff(new GarageDoor()));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [1] click\n");
        System.out.printf(remote.onButtonWasPushed(1));
        System.out.printf(" executing off button [1] click\n");
        System.out.printf(remote.offButtonWasPushed(1));

        remote.setCommand(2, new LightOnCommand(new Light("sala")), new LightOffCommand(new Light("sala")));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [2] click\n");
        System.out.printf(remote.onButtonWasPushed(2));
        System.out.printf(" executing off button [2] click\n");
        System.out.printf(remote.offButtonWasPushed(2));

        remote.setCommand(3, new StereoOnCommand(new Stereo("dormitorio")), new StereoOffCommand(new Stereo("dormitorio")));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [3] click\n");
        System.out.printf(remote.onButtonWasPushed(3));
        System.out.printf(" executing off button [3] click\n");
        System.out.printf(remote.offButtonWasPushed(3));

        remote.setCommand(4, new StereoOnCommand(new Stereo("sala")), new StereoOffCommand(new Stereo("sala")));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [4] click\n");
        System.out.printf(remote.onButtonWasPushed(4));
        System.out.printf(" executing off button [4] click\n");
        System.out.printf(remote.offButtonWasPushed(4));

        remote.setCommand(5, new LightOnCommand(new Light("cuarto")), new LightOffCommand(new Light("cuarto")));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [5] click\n");
        System.out.printf(remote.onButtonWasPushed(5));
        System.out.printf(" executing off button [5] click\n");
        System.out.printf(remote.offButtonWasPushed(5));

        remote.setCommand(6, new LightOnCommand(new Light("jardin")), new LightOffCommand(new Light("jardin")));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [6] click\n");
        System.out.printf(remote.onButtonWasPushed(6));
        System.out.printf(" executing off button [6] click\n");
        System.out.printf(remote.offButtonWasPushed(6));

        remote.setCommand(7, new StereoOnCommand(new Stereo("cine")), new StereoOffCommand(new Stereo("cine")));
        System.out.printf(remote.toString());
        System.out.printf(" executing on button [7] click\n");
        System.out.printf(remote.onButtonWasPushed(7));
        System.out.printf(" executing off button [7] click\n");
        System.out.printf(remote.offButtonWasPushed(7));
    }
}
