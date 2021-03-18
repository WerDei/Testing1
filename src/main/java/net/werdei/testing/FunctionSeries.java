package net.werdei.testing;

import static java.lang.Math.pow;

public class FunctionSeries
{
    private static final int DEFAULT_DEPTH = 10;


    public static double arcsin(double x)
    {
        return arcsin(x, DEFAULT_DEPTH);
    }

    public static double arcsin(double x, int depth)
    {
        if (depth < 1) throw new RuntimeException();
        if (Math.abs(x) > 1) return Double.NaN;

        double cum = 0;
        for (int n = 0; n < depth; n++)
        {
            cum += factorial(2*n) /
                    (pow(4, n) * pow(factorial(n), 2) * (2*n + 1)) *
                    pow(x, 2*n + 1);
        }
        return cum;
    }

    private static int factorial(int x)
    {
        if (x < 0) throw new RuntimeException();

        int out = 1;
        for (int i = x; i > 1; i--) {
            out *= i;
        }
        return out;
    }
}
