package Split;

public class Split implements Pairs {
    // "RLLRLLLRRRRL"

    @Override
    public int calc(String origin) {
        String[] x=origin.split("[RLLR,] ");
        return x.length;

    }
}
