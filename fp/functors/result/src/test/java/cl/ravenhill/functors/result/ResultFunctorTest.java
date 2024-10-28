package cl.ravenhill.functors.result;

import net.jqwik.api.*;
import org.junit.jupiter.api.DisplayName;

import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ResultFunctorTest {
    @DisplayName(
            "Given a result"
            + "when mapping the identity function"
            + "then it should return the same result"
    )
    @Property
    public void testIdentity(@ForAll("resultArb") Result<Integer> result) {
        var mapped = ResultFunctor.map(result, Function.identity());
        assertThat(mapped, equalTo(result));
        throw new AssertionError("This test should pass");
    }

    @Provide
    Arbitrary<Result<Integer>> resultArb() {
        var successArb = Arbitraries.integers().map(Success::new);
        var failureArb = throwableArb().map(Failure<Integer>::new);

        return Arbitraries.oneOf(successArb, failureArb);
    }

    @Provide
    Arbitrary<Throwable> throwableArb() {
        return Arbitraries.strings().map(Throwable::new);
    }
}
