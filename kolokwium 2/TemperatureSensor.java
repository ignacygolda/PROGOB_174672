public class TemperatureSensor implements Sensor{
    double value;
    String status;

    @Override
    public double readValue() {
        return this.value;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void reset() {
        System.out.println("reset");
        this.value = 0;
        this.status = "";
    }
}
