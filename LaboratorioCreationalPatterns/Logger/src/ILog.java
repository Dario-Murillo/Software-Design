/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public interface ILog extends AutoCloseable {
    void writeMessage(String text);
}
