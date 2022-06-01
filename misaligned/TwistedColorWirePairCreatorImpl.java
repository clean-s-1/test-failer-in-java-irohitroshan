import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TwistedColorWirePairCreatorImpl implements TwistedColorWirePairCreator {
    @Override
    public List<TwistedColorWirePair> createTwistedColorWirePairs(final String[] majorColors,final  String[] minorColors) {

        final List<TwistedColorWirePair> twistedColorWirePairs = new ArrayList<>();
        AtomicInteger pair = new AtomicInteger(0);
        Arrays.stream(majorColors).forEach(majorColorName -> Arrays.stream(minorColors).forEach(minorColorName ->
                twistedColorWirePairs.add(new TwistedColorWirePair(pair.getAndIncrement(), majorColorName, minorColorName)))
        );


        return twistedColorWirePairs;
    }
}
