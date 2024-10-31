package cl.ravenhill.validation;

public interface Validator<T> {
    boolean validate(T value);
}
