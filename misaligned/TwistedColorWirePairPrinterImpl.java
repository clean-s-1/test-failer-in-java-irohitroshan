import java.util.List;

public class TwistedColorWirePairPrinterImpl implements TwistedColorWirePairPrinter {

    private static String formattedColorWirePairList ;

    public static String getFormattedColorWirePairList() {
        return formattedColorWirePairList;
    }

    @Override
    public void printTwistedColorWirePair(List<TwistedColorWirePair> twistedColorWirePairs) {
        StringBuilder colorPairManualBuilder = new StringBuilder();
        twistedColorWirePairs.forEach(twistedColorWirePair ->{

                colorPairManualBuilder.append(String.format("%d | %s | %s\n",
                        twistedColorWirePair.getWirePair(),
                        twistedColorWirePair.getMajorColor(),
                        twistedColorWirePair.getMinorColor()));

                System.out.printf("%d | %s | %s\n",
                twistedColorWirePair.getWirePair(),
                twistedColorWirePair.getMajorColor(),
                twistedColorWirePair.getMinorColor());});
        formattedColorWirePairList = colorPairManualBuilder.toString();
    }
}
