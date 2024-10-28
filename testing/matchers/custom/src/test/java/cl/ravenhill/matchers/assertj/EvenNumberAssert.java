package cl.ravenhill.matchers.assertj;

import org.assertj.core.api.AbstractAssert;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class EvenNumberAssert
        extends AbstractAssert<EvenNumberAssert, Integer> {

    public EvenNumberAssert(Integer actual) {
        super(actual, EvenNumberAssert.class);
    }

    @Contract("_ -> new")
    public static @NotNull EvenNumberAssert assertThat(Integer actual) {
        return new EvenNumberAssert(actual);
    }

    public EvenNumberAssert isEven() {
        isNotNull();
        if (actual % 2 != 0) {
            failWithMessage(
                    "Expected <%s> to be even, but it was not.",
                    actual
            );
        }
        return this;
    }
}
