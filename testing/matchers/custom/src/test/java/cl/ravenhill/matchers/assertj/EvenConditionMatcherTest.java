package cl.ravenhill.matchers.assertj;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cl.ravenhill.matchers.assertj.EvenConditionMatcher.even;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvenConditionMatcherTest {
    @DisplayName(
            "Given an even number, " +
                    "when checking if it is even, " +
                    "then it should pass"
    )
    @Test
    void testEvenNumberIsEven() {
        assertThat(2).is(even);
    }

    @DisplayName(
            "Given an even number, " +
                    "when checking if it is not even, " +
                    "then it should fail"
    )
    @Test
    void testEvenNumberIsNotEven() {
        assertThrows(AssertionError.class, () -> assertThat(2).isNot(even));
    }

    @DisplayName(
            "Given an odd number, " +
                    "when checking if it is not even, " +
                    "then it should pass"
    )
    @Test
    void testOddNumberIsNotEven() {
        assertThat(3).isNot(even);
    }

    @DisplayName(
            "Given an odd number, " +
                    "when checking if it is even, " +
                    "then it should fail"
    )
    @Test
    void testOddNumberIsEven() {
        assertThrows(AssertionError.class, () -> assertThat(3).is(even));
    }
}
