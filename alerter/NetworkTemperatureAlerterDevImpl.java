public class NetworkTemperatureAlerterDevImpl implements NetworkTemperatureAlerter{

    @Override
    public Integer networkAlertStub(final float celsius) {
        System.out.println("ALERT: Temperature is " + celsius + " celsius");
        if (celsius > 200) {
            return 500;
        }
        return 200;
    }
}
