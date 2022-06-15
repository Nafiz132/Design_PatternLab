package strategy;

import static java.lang.Math.abs;

public class Subtraction implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return abs(num1-num2);

    }
}
