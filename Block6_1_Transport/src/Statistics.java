/**
 * Created by Зая on 19.05.2016.
 */
public interface Statistics {
    int countCarTotal();//counts the total number of vehicles that crossed the road

    int countCarInGroup(Class vehicleType);// counts the total number of vehicles  of specific type: autoTruck, Car, Motorbike

    boolean findTransport(Class vehicleType, String serial, String model);// checks if the vehicle of specific type, serial number, model passed the crossroad

    void addVehicle(Vehicle veh);//adds a record about the  vehicle that passed the crossroad
}
