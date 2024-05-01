/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class WorkReportEntry {
    private String projectCode;
    private String projectName;
    private int spentHours;

    public WorkReportEntry(String projectCode, String projectName, int spentHours) {
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.spentHours = spentHours;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getSpentHours() {
        return spentHours;
    }

    public void setSpentHours(int spentHours) {
        this.spentHours = spentHours;
    }
}
