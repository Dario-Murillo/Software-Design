public class ScooterBuilder extends VehicleBuilder
{
    public ScooterBuilder()
    {
        vehicle = new Vehicle("Scooter");
    }
    @Override
    public void BuildFrame()
    {
        vehicle.setPart("frame", "Scooter Frame");
    }
    @Override
    public void BuildEngine()
    {
        vehicle.setPart("engine", "50 cc");
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