package src.UnitTesting;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator Calc;

    @BeforeAll
    public static void setup() {
        Calc = new Calculator();

    }


    @org.junit.jupiter.api.Test
    void add() {
        int res = (int) Calc.add(12,3);
        assertEquals(15,res);

    }

    @org.junit.jupiter.api.Test
    void substract() {
        int res = (int) Calc.subtract(12,3);
        assertEquals(9,res);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        int res = (int) Calc.divide(12,3);
        assertEquals(4,res);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int res = (int) Calc.multiply(12,3);
        assertEquals(36,res);
    }

    @org.junit.jupiter.api.Test
    void getRemainder() {
        int res = (int) Calc.getRemainder(12,5);
        assertEquals(2,res);
    }
}