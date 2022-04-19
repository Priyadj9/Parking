package model;

import exception.InvalidVehicleNumber;
import exception.NoEmptySlotAvailable;
import cost.ParkingCost;

public interface ParkingFloor {

    boolean createParkingSLot(int numberOfSlots);

    boolean parkVehicle(Vehicle vehicle) throws NoEmptySlotAvailable;

    int unPark(String vehicleNumber, int numberOfHours, ParkingCost parkingCostStrategy) throws InvalidVehicleNumber;
}
