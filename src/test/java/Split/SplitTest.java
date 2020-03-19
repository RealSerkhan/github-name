package Split;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitTest {
    private Pairs m = new Split();


    @BeforeEach
    public void initialize() {
    }

    @Test
    void calc() {
        String orign="RLLRLLLRRRRL";
        int expected=4;
        int actual=m.calc(orign);
        assertEquals(expected, actual);
    }
}