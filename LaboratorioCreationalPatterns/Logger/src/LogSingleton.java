/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class LogSingleton implements ILog {
    private static LogSingleton instance;
    private static final String ArchivoDeLog = "C:\\Temp\\Log.txt";
    private PrintWriter writer;

    private LogSingleton() {
        try {   
            this.writer = new PrintWriter(new FileWriter(ArchivoDeLog, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogSingleton getInstance() {
        if (instance == null) {
            
            synchronized(LogSingleton.class) {
                if (instance == null) {
                    instance = new LogSingleton();
                }
            }
        }

        return instance;
    }

    @Override
    public void close() throws Exception {
        writer.close();
        System.out.println("File write complete.");
    }

    @Override
    public void writeMessage(String text) {
        writer.println(java.time.LocalDateTime.now() + " " + text);
        writer.flush();
    }
}
