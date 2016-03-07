/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service;

import java.util.List;

import io.vntr.bean.Users;

/** Service Interface for entity Users. */
public interface UsersService
{ 
	/**
	 * Loads a bean from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Users findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Users> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Users save(Users bean);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Users update(Users bean);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Users create(Users bean);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );
}