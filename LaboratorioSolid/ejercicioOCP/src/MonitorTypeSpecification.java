/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class MonitorTypeSpecification implements ISpecification<ComputerMonitor> {

    private MonitorType type;
    public MonitorTypeSpecification(MonitorType type) {
        this.type = type;
    }

    @Override
    public boolean isSatisfied(ComputerMonitor item) {
        return item.getType() == this.type;
    }
}
