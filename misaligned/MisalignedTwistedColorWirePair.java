import java.util.List;

public class MisalignedTwistedColorWirePair {

    public static final String RED = "Red";
    public static final String GREEN = "Green";

    public static void main(String[] args) {
        
        List<TwistedColorWirePair> twistedColorWirePairs = getTwistedColorWirePairs();
        testTwistedColorWirePair(twistedColorWirePairs);
        printTwistedColorPairs(twistedColorWirePairs);
        testTwistedColorPairManualFormat(twistedColorWirePairs);
        int result = twistedColorWirePairs.size();
        assert(result == 25);
        System.out.println("All is well (maybe!)");
    }

    private static void testTwistedColorWirePair(List<TwistedColorWirePair> twistedColorWirePairs) {

        TwistedColorWirePair twistedColorWirePair = twistedColorWirePairs.get(7);

        assert (RED.equalsIgnoreCase(twistedColorWirePair.getMajorColor())):" Invalid Major Color";
        assert (GREEN.equalsIgnoreCase(twistedColorWirePair.getMinorColor())):"Invalid Minor Color";
    }

    private static void testTwistedColorPairManualFormat(List<TwistedColorWirePair> twistedColorPairList) {

        StringBuilder manualBuilder = new StringBuilder();
        for(TwistedColorWirePair twistedColorPair : twistedColorPairList) {
            manualBuilder.append(String.format("%d | %s | %s\n",twistedColorPair.getWirePair(),twistedColorPair.getMajorColor(),twistedColorPair.getMinorColor()));
        }
        String expectedColorPairManualFormat = manualBuilder.toString();
        System.out.println("**** Expected Colored Wire Pair Manual Format ********");
        System.out.println(expectedColorPairManualFormat);
        System.out.println("***** Actual Colored Wire Pair Manual Format **********");

        String actualColorPairManualFormat = TwistedColorWirePairPrinterImpl.getFormattedColorWirePairList();
        System.out.println(actualColorPairManualFormat);
        assert (actualColorPairManualFormat.equalsIgnoreCase(expectedColorPairManualFormat));

    }

    private static void printTwistedColorPairs(List<TwistedColorWirePair> twistedColorWirePairs) {
        TwistedColorWirePairPrinter twistedColorWirePairPrinter = new TwistedColorWirePairPrinterImpl();
        twistedColorWirePairPrinter.printTwistedColorWirePair(twistedColorWirePairs);
    }

    private static List<TwistedColorWirePair> getTwistedColorWirePairs() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        TwistedColorWirePairCreator twistedColorWirePairCreator = new TwistedColorWirePairCreatorImpl();
        List<TwistedColorWirePair> twistedColorWirePairs= twistedColorWirePairCreator.createTwistedColorWirePairs(majorColors,minorColors);
        return twistedColorWirePairs;
    }
}
