/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service;

import java.util.List;

import io.vntr.bean.Vents;

/** Service Interface for entity Vents. */
public interface VentsService
{ 
	/**
	 * Loads a bean from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Vents findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Vents> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Vents save(Vents bean);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Vents update(Vents bean);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Vents create(Vents bean);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );
}