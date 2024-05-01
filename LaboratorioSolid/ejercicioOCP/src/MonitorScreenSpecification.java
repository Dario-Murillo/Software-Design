/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class MonitorScreenSpecification implements ISpecification<ComputerMonitor> {

    private Screen screenType;
    public MonitorScreenSpecification(Screen screenType) {
        this.screenType = screenType;
    }

    @Override
    public boolean isSatisfied(ComputerMonitor item) {
        return item.getScreen() == this.screenType;
    }
}
