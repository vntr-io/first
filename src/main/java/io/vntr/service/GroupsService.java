/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service;

import java.util.List;

import io.vntr.bean.Groups;

/** Service Interface for entity Groups. */
public interface GroupsService
{ 
	/**
	 * Loads a bean from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Groups findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Groups> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Groups save(Groups bean);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Groups update(Groups bean);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Groups create(Groups bean);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );
}