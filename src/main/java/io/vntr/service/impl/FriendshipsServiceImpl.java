/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.vntr.service.FriendshipsService;
import io.vntr.bean.Friendships;
import io.vntr.jpa.FriendshipsJpaRepository;
import io.vntr.jpa.bean.FriendshipsEntity;
import io.vntr.jpa.bean.FriendshipsEntityKey;
import io.vntr.mapper.FriendshipsEntityBeanMapper;

@Component
public class FriendshipsServiceImpl implements FriendshipsService
{
	@Autowired
	private FriendshipsJpaRepository friendshipsJpaRepository; 

    @Autowired
    private FriendshipsEntityBeanMapper friendshipsEntityBeanMapper;

	public Friendships findById( Integer userId1, Integer userId2  )
	{
        FriendshipsEntityKey key = new FriendshipsEntityKey(userId1, userId2);
        FriendshipsEntity entity = friendshipsJpaRepository.findOne(key);
        return friendshipsEntityBeanMapper.mapEntityToBean(entity);
	}

	public List<Friendships> findAll()
	{
		List<Friendships> list = new LinkedList<Friendships>();
		Iterator<FriendshipsEntity> iter = friendshipsJpaRepository.findAll().iterator();
		while(iter.hasNext())
		{
			list.add(friendshipsEntityBeanMapper.mapEntityToBean(iter.next()));
		}
		return list;
	}

	public Friendships save(Friendships bean)
	{
		return persist(bean);
	}

	public Friendships update(Friendships bean)
	{
		return persist(bean);
	}

	public Friendships create(Friendships bean)
	{
		return persist(bean);
	}

	public void delete( Integer userId1, Integer userId2 )
	{
        FriendshipsEntityKey key = new FriendshipsEntityKey(userId1, userId2);
        friendshipsJpaRepository.delete(key);
	}

	private Friendships persist(Friendships bean)
	{
		FriendshipsEntity entity = friendshipsEntityBeanMapper.mapBeanToEntity(bean);
		FriendshipsEntity persistedEntity = friendshipsJpaRepository.save(entity);
		return friendshipsEntityBeanMapper.mapEntityToBean(persistedEntity);
	}
}