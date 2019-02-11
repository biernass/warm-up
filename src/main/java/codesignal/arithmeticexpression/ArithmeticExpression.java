package codesignal.arithmeticexpression;

public class ArithmeticExpression {

    public boolean arithmeticExpression(int a, int b, int c) {

        double ad = a;

        if (ad * b == c | ad + b == c | ad / b == c | ad - b == c) {
            return true;
        }

        return false;
    }
}
