package app;

import Testing1.Filterable;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TestssTest {
    private Filterable m;


   @BeforeEach
   public void initialize() {
       this.m = new Filterable();
   }


    public void test1(){
       String orign="Hello";
       String expected="hll";
       String actual=m.filter(orign);
       assertEquals(expected, actual);
   }

}