public class MotorCycleBuilder extends VehicleBuilder
{
    public MotorCycleBuilder()
    {
        vehicle = new Vehicle("MotorCycle");
    }
    @Override
    public void BuildFrame()
    {
        vehicle.setPart("frame", "MotorCycle Frame");
    }
    @Override
    public void BuildEngine()
    {
        vehicle.setPart("engine", "500 cc");
    }
    @Override
    public void BuildWheels()
    {
        vehicle.setPart("wheels", "2");
    }
    @Override
    public void BuildDoors()
    {
        vehicle.setPart("doors", "0");
    }
}