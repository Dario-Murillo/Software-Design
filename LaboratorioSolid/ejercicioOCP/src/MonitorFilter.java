/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.List;
import java.util.stream.Collectors;

public class MonitorFilter {

    /*
    public List<ComputerMonitor> filterByType(List<ComputerMonitor> monitors, MonitorType type) {
        return monitors.stream()
                       .filter(m -> m.getType() == type)
                       .collect(Collectors.toList());
    } */

    public static List<ComputerMonitor> filter(List<ComputerMonitor> monitors, ISpecification<ComputerMonitor> specification) {
        return monitors.stream()
                       .filter(m -> specification.isSatisfied(m))
                       .collect(Collectors.toList());
    }
}
