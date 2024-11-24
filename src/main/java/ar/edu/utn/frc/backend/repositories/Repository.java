package ar.edu.utn.frc.backend.repositories;

import java.util.List;

public interface Repository<T,K> {

    void add(T entity);
    void update(T entity);
    T delete(T entity);
    T findbyId(K id);
    List<T> findAll();
}
