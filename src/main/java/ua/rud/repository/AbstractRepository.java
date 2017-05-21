package ua.rud.repository;

import java.util.List;

public interface AbstractRepository<T> {
    void add(T object);

    void remove(T object);

    void update(T object);

    List<T> query(Specification<T> specification);
}
