import java.security.InvalidParameterException;

public class Calculator {
    private double result;

    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double addToResult(double a) {
        result = result + a;
        return result;
    }

    public double sub(double a, double b) {
        result = a - b;
        return result;
    }

    public double subToResult(double a) {
        result = result - a;
        return result;
    }

    public double mul(double a, double b) {
        result = a * b;
        return result;
    }

    public double mulToResult(double a) {
        result = result * a;
        return result;
    }

    public double div(double a, double b) {
        if ((a == 0) || (b == 0)) {
            throw new InvalidParameterException("Error: a or b == 0");
        }
        result = a / b;
        return result;
    }

    public double divToResult(double a) {
        if (a == 0) {
            throw new InvalidParameterException("Error: a == 0");
        }
        result = result / a;
        return result;
    }

    public double pow(double a, long b) {
        result = Math.pow(a, b);
        return result;
    }

    public double powToResult(double a) {
        result = Math.pow(result, a);
        return result;
    }

}
