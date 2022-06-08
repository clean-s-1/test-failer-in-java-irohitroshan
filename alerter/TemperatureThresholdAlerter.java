public class TemperatureThresholdAlerter {
    public static final String ENV_TYPE = "DEVELOPMENT";
    static int alertFailureCount = 0;

    static void alertInCelsius(float fahrenheit , NetworkTemperatureAlerter networkTemperatureAlerter) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        int returnCode = networkTemperatureAlerter.networkAlertStub(celsius);
        if (returnCode != 200) {
            alertFailureCount += 1;
        }
    }

    private static NetworkTemperatureAlerter getNetworkAlert() {
        NetworkTemperatureAlerter networkTemperatureAlerter = null;
        if (EnvironmentType.DEVELOPMENT.name().equals(ENV_TYPE)) {
            networkTemperatureAlerter = new NetworkTemperatureAlerterDevImpl();
        } else if (EnvironmentType.PRODUCTION.name().equals(ENV_TYPE)) {
            networkTemperatureAlerter = new NetworkTemperatureAlerterImpl();
        }
        return networkTemperatureAlerter;
    }

    public static void main(String[] args) {
        NetworkTemperatureAlerter networkTemperatureAlerter = getNetworkAlert();
        alertInCelsius(400.5f, networkTemperatureAlerter);
        alertInCelsius(303.6f, networkTemperatureAlerter);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        assert (alertFailureCount == 1);
        System.out.println("All is well (maybe!)\n");
    }
}
