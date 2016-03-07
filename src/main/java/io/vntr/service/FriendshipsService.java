/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service;

import java.util.List;

import io.vntr.bean.Friendships;

/** Service Interface for entity Friendships. */
public interface FriendshipsService
{ 
	/**
	 * Loads a bean from the database using its Primary Key
	 * @param userId1
	 * @param userId2
	 * @return entity
	 */
	Friendships findById( Integer userId1, Integer userId2  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Friendships> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Friendships save(Friendships bean);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Friendships update(Friendships bean);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Friendships create(Friendships bean);

	/**
	 * Deletes an entity using its Primary Key
	 * @param userId1
	 * @param userId2
	 */
	void delete( Integer userId1, Integer userId2 );
}