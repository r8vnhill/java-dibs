package cl.ravenhill.functors.result;

import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

public final class ResultFunctor<T> {
    @NotNull
    public static <T, U> Result<U> map(@NotNull Result<T> result, Function<T, U> f) {
        return switch (result) {
            case Success<T> success -> new Success<>(f.apply(success.value()));
            case Failure<T> failure -> new Failure<>(failure.error());
        };
    }
}
