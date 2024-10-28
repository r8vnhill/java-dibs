package cl.ravenhill.matchers.assertj;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cl.ravenhill.matchers.assertj.EvenNumberAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvenNumberAssertTest {
    @DisplayName(
            "Given an even number, " +
                    "when checking if it is even, " +
                    "then it should pass"
    )
    @Test
    void testEvenNumber() {
        assertThat(2).isEven();
    }

    @DisplayName(
            "Given an odd number, " +
                    "when checking if it is even, " +
                    "then it should fail"
    )
    @Test
    void testOddNumber() {
        assertThrows(AssertionError.class, () -> assertThat(3).isEven());
    }
}
