package cost;

public class DefaultCost implements ParkingCost  {

    @Override
    public int getCost(int parkHours) {
        if (parkHours < 2) {
            return 10;
        }
        return (parkHours - 2) * 10 + 10;
    }
}
