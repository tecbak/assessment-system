package ua.rud.repository;

public interface Specification<T> {
    boolean specified(T object);
}
