package cl.ravenhill.math;

public class Divider {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor can't be zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));
        /* Output:
        5.0
        Exception in thread "main" java.lang.IllegalArgumentException: Divisor can't be zero
            at cl.ravenhill.math.Divider.divide(Divider.java:6)
            at cl.ravenhill.math.Divider.main(Divider.java:13)
        */
    }
}
