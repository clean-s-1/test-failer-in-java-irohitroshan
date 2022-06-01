public class TemperatureThresholdAlerter {
    static int alertFailureCount = 0;

    static void alertInCelsius(float fahrenheit , TemperatureThresholdStub temperatureThresholdStub) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        int returnCode = temperatureThresholdStub.networkAlertStub(celsius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 0;
            assert (alertFailureCount > 0):"Non ok response was not counted since stub was always returning 200";
        }
    }
    public static void main(String[] args) {
        TemperatureThresholdStub temperatureThresholdStub = new TemperatureThresholdStubImpl();
        alertInCelsius(400.5f, temperatureThresholdStub);
        alertInCelsius(303.6f, temperatureThresholdStub);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
