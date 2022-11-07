package com.example.mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;

import javax.script.ScriptException;

public class EvaluateTest {

    @Test
    public void evaluate_add() throws ScriptException {
        Evaluate e = new Evaluate();
        double actual = e.evaluate("2+2").doubleValue();
        double expected = 4.0;
        assertEquals("We have an error, values don't match", expected, actual, 0.0001);
    }

    @Test
    public void evaluate_rm_excess_decimals() {
        Evaluate e = new Evaluate();
        BigDecimal decimal = new BigDecimal("-2.0");
        String actual = e.rmExcessDecimals(decimal);
        String excepted = "-2";
        assertEquals("The excess decimals were not removed", excepted, actual);
    }
}