package cl.ravenhill.functors.result;

public record Failure<T>(Throwable error) implements Result<T> { }
