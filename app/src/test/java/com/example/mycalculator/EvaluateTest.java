package com.example.mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.script.ScriptException;

public class EvaluateTest {

    @Test
    public void evaluate_add() throws ScriptException {
        Evaluate e = new Evaluate();
        double actual = e.evaluate("2+2").doubleValue();
        double expected = 4.0;
        assertEquals("We have an error, values don't match", expected, actual, 0.0001);
    }
}