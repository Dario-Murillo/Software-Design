/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        WorkReport report = new WorkReport();
        report.addEntry(new WorkReportEntry("PROJ1", "Project1", 5));
        report.addEntry(new WorkReportEntry("PROJ2", "Project2", 3));
        report.addEntry(new WorkReportEntry("PROJ3", "Project3", 6));
        report.addEntry(new WorkReportEntry("PROJ4", "Project4", 2));

        System.out.println(report.toString());
        try {
            SaveWorkReport.saveToFile("Reports", "WorkReport.txt", report.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

