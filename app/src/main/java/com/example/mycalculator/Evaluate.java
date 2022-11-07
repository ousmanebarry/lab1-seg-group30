package com.example.mycalculator;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluate {
    public ScriptEngine engine;

    public Evaluate() {
        engine = new ScriptEngineManager().getEngineByName("rhino");
    }

    public BigDecimal evaluate(String expression) throws ScriptException {
        String result = engine.eval(expression).toString();
        return new BigDecimal(result);
    }

    public String rmExcessDecimals(BigDecimal decimal) {
        String decimalStr = decimal.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString();

        if (decimalStr.matches("[-]?[0-9]+(\\.0*)?$")) {
            return Integer.toString(decimal.intValue());
        }
        return decimal.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString();
    }
}
