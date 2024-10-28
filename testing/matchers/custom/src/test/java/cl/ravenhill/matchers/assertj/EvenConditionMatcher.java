package cl.ravenhill.matchers.assertj;

import org.assertj.core.api.Condition;

public class EvenConditionMatcher {
    public static Condition<Integer> even =
            new Condition<>(value -> value % 2 == 0, "even");
}
