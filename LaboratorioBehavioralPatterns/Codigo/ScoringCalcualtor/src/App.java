/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */


import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        ScoringAlgorithm algorithm;

        System.out.print("Man ");
        algorithm = new MenScoringAlgorithm();
        System.out.println(algorithm.generateScore(8, Duration.ofMinutes(1).plusSeconds(31)));

        System.out.print("Woman ");
        algorithm = new WomenScoringAlgorithm();
        System.out.println(algorithm.generateScore(9, Duration.ofMinutes(1).plusSeconds(49)));

        System.out.print("Child ");
        algorithm = new ChildrenScoringAlgorithm();
        System.out.println(algorithm.generateScore(5, Duration.ofMinutes(3).plusSeconds(2)));

        System.out.println("Press Enter to exit.");
        new java.util.Scanner(System.in).nextLine();
    }
}
