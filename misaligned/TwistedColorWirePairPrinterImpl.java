import java.util.List;

public class TwistedColorWirePairPrinterImpl implements TwistedColorWirePairPrinter {
    @Override
    public void printTwistedColorWirePair(List<TwistedColorWirePair> twistedColorWirePairs) {
        twistedColorWirePairs.forEach(twistedColorWirePair -> System.out.printf("%d | %s | %s\n",
                twistedColorWirePair.getWirePair(),
                twistedColorWirePair.getMajorColor(),
                twistedColorWirePair.getMinorColor()));
    }
}
