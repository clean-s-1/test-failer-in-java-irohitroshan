public class TwistedColorWirePair {

    private Integer wirePair;
    private String majorColor;
    private String minorColor;

    public TwistedColorWirePair(final Integer wirePair, final String majorColor,final String minorColor) {
        this.wirePair = wirePair;
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public Integer getWirePair() {
        return wirePair;
    }

    public String getMajorColor() {
        return majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }
}
