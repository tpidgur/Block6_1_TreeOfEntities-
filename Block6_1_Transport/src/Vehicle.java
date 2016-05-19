/**
 * Created by Зая on 19.05.2016.
 */
public abstract class Vehicle implements Transport{
    private String serialNumber;
    private String  model;



    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
