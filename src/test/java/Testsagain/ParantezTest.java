package Testsagain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParantezTest {

    private Parantez app;
//    String orign="Hello";
//    String expected="hll";
//    String actual=m.filter(orign);
//    assertEquals(expected, actual);

    @BeforeEach
    public void setUp() {
        this.app =
                new Parantez();
    }

    @Test
    public void calc1() {
        String orign="()()()";
        int expected=1;
        int actual=app.calc(orign);
        assertEquals(expected, actual);
    }

    @Test
    public void calc1a() {
        String orign="()";
        int expected=1;
        int actual=app.calc(orign);
        assertEquals(expected, actual);
    }

    @Test
    public void calc2() {
        String orign="()(()())()";
        int expected=2;
        int actual=app.calc(orign);
        assertEquals(expected, actual);
    }

    @Test
    public void calc3() {
        String orign="()(()())((()()))(())()";
        int expected=3;
        int actual=app.calc(orign);

        assertEquals(expected, actual);
    }
}