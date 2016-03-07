/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service;

import java.util.List;

import io.vntr.bean.Memberships;

/** Service Interface for entity Memberships. */
public interface MembershipsService
{ 
	/**
	 * Loads a bean from the database using its Primary Key
	 * @param userId
	 * @param groupId
	 * @return entity
	 */
	Memberships findById( Integer userId, Integer groupId  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Memberships> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Memberships save(Memberships bean);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Memberships update(Memberships bean);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Memberships create(Memberships bean);

	/**
	 * Deletes an entity using its Primary Key
	 * @param userId
	 * @param groupId
	 */
	void delete( Integer userId, Integer groupId );
}