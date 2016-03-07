/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.vntr.service.GroupsService;
import io.vntr.bean.Groups;
import io.vntr.jpa.GroupsJpaRepository;
import io.vntr.jpa.bean.GroupsEntity;
import io.vntr.mapper.GroupsEntityBeanMapper;

public class GroupsServiceImpl implements GroupsService
{
	@Autowired
	private GroupsJpaRepository groupsJpaRepository; 

    @Autowired
    private GroupsEntityBeanMapper groupsEntityBeanMapper;

	public Groups findById( Integer id  )
	{
        GroupsEntity entity = groupsJpaRepository.findOne(id);
        return groupsEntityBeanMapper.mapEntityToBean(entity);
	}

	public List<Groups> findAll()
	{
		List<Groups> list = new LinkedList<Groups>();
		Iterator<GroupsEntity> iter = groupsJpaRepository.findAll().iterator();
		while(iter.hasNext())
		{
			list.add(groupsEntityBeanMapper.mapEntityToBean(iter.next()));
		}
		return list;
	}

	public Groups save(Groups bean)
	{
		return persist(bean);
	}

	public Groups update(Groups bean)
	{
		return persist(bean);
	}

	public Groups create(Groups bean)
	{
		return persist(bean);
	}

	public void delete( Integer id )
	{
        groupsJpaRepository.delete(id);
	}

	private Groups persist(Groups bean)
	{
		GroupsEntity entity = groupsEntityBeanMapper.mapBeanToEntity(bean);
		GroupsEntity persistedEntity = groupsJpaRepository.save(entity);
		return groupsEntityBeanMapper.mapEntityToBean(persistedEntity);
	}
}