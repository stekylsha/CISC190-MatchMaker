package edu.sdccd.mesa.cisc190.calculator.operators;

import edu.sdccd.mesa.cisc190.calculator.Operator;

public class AdditionOperator implements Operator
{
    public int operate(int x, int y) {
        int rv = x + y;
        return rv;
    }
}
