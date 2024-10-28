package cl.ravenhill.functors.result;

public record Success<T>(T value) implements Result<T> { }
