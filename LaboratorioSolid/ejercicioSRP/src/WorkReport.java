/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.ArrayList;
import java.util.List;

public class WorkReport {
    private List<WorkReportEntry> entries;

    public WorkReport() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(WorkReportEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntryAt(int index) {
        this.entries.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (WorkReportEntry entry : this.entries) {
            sb.append(String.format("Code: %s, Name: %s, Hours: %d%n",
                    entry.getProjectCode(), entry.getProjectName(), entry.getSpentHours()));
        }
        return sb.toString();
    }
}
