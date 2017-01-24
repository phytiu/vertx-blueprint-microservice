package io.vertx.blueprint.microservice.cart.repository;

import rx.Observable;

/**
 * Simple Rx-fied data source service interface for CRUD.
 *
 * @param <T> Type of the entity
 * @param <ID> Type of the persistence key
 */
public interface SimpleCrudDataSource<T, ID> {

  /**
   * Save an entity to the persistence.
   *
   * @param entity entity object
   * @return an observable async result
   */
  Observable<Void> save(T entity);

  /**
   * Retrieve one certain entity by `id`.
   *
   * @param id id of the entity
   * @return an observable async result
   */
  Observable<T> retrieveOne(ID id);

  /**
   * Delete the entity by `id`.
   *
   * @param id id of the entity
   * @return an observable async result
   */
  Observable<Void> delete(ID id);

}
