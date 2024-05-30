public class Builder {
    public static void main(String[] args) throws Exception {
        VehicleBuilder builder;
        // Create shop with vehicle builders
        Shop shop = new Shop();
        // Construct and display vehicles
        builder = new ScooterBuilder();
        shop.Construct(builder);
        builder.Show();
        builder = new CarBuilder();
        shop.Construct(builder);
        builder.Show();
        builder = new MotorCycleBuilder();
        shop.Construct(builder);
        builder.Show();
    }
}
