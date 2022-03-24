package com.procleanperu.products.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CrudService <T,ID> {
    List<T> findAll();
    Mono<T> save(T entity);
    Mono<T> updateById(T entity, ID id);
    Mono<T> deleteById(ID id);
    Mono<T> findById(ID id);
}
