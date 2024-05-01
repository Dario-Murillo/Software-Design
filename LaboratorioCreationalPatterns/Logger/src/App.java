/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class App {
    public static void main(String[] args) throws Exception {
        ILog instancia1 = LogSingleton.getInstance();
        ILog instancia2 = LogSingleton.getInstance();
        ILog instancia3 = LogSingleton.getInstance();

        if ((instancia1 == instancia2) && (instancia2 == instancia3)) {
            System.out.println("Estamos instanciando un singleton");
        } else {
            System.out.println("NO Estamos instanciando un singleton");
        }


        int n = 8; 
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new Multithread());
            object.start();
        }


        ILog logger = LogSingleton.getInstance(); // replace with LogSingleton.getInstance() once we have the Singleton

        long startTime = System.currentTimeMillis();
        for (short i = 1; i < 1000; i++) {
            logger.writeMessage(String.format("Message Test %d", i));
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println();
        System.out.printf("Tiempo transcurrido %d milisegundos%n", elapsedTime);

        logger.close();
        // Wait for user input
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
