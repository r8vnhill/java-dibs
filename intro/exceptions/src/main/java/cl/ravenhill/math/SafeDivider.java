package cl.ravenhill.math;

import java.util.Optional;

public class SafeDivider {
    public static Optional<Double> divide(double dividend, double divisor) {
        try {
            return Optional.of(Divider.divide(dividend, divisor));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));
        /* Output:
        Optional[5.0]
        Optional.empty
        */
    }
}
