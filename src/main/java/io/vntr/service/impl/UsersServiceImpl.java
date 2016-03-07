/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.vntr.service.UsersService;
import io.vntr.bean.Users;
import io.vntr.jpa.UsersJpaRepository;
import io.vntr.jpa.bean.UsersEntity;
import io.vntr.mapper.UsersEntityBeanMapper;

public class UsersServiceImpl implements UsersService
{
	@Autowired
	private UsersJpaRepository usersJpaRepository; 

    @Autowired
    private UsersEntityBeanMapper usersEntityBeanMapper;

	public Users findById( Integer id  )
	{
        UsersEntity entity = usersJpaRepository.findOne(id);
        return usersEntityBeanMapper.mapEntityToBean(entity);
	}

	public List<Users> findAll()
	{
		List<Users> list = new LinkedList<Users>();
		Iterator<UsersEntity> iter = usersJpaRepository.findAll().iterator();
		while(iter.hasNext())
		{
			list.add(usersEntityBeanMapper.mapEntityToBean(iter.next()));
		}
		return list;
	}

	public Users save(Users bean)
	{
		return persist(bean);
	}

	public Users update(Users bean)
	{
		return persist(bean);
	}

	public Users create(Users bean)
	{
		return persist(bean);
	}

	public void delete( Integer id )
	{
        usersJpaRepository.delete(id);
	}

	private Users persist(Users bean)
	{
		UsersEntity entity = usersEntityBeanMapper.mapBeanToEntity(bean);
		UsersEntity persistedEntity = usersJpaRepository.save(entity);
		return usersEntityBeanMapper.mapEntityToBean(persistedEntity);
	}
}