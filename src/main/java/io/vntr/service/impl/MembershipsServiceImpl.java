/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.vntr.service.MembershipsService;
import io.vntr.bean.Memberships;
import io.vntr.jpa.MembershipsJpaRepository;
import io.vntr.jpa.bean.MembershipsEntity;
import io.vntr.jpa.bean.MembershipsEntityKey;
import io.vntr.mapper.MembershipsEntityBeanMapper;

@Component
public class MembershipsServiceImpl implements MembershipsService
{
	@Autowired
	private MembershipsJpaRepository membershipsJpaRepository; 

    @Autowired
    private MembershipsEntityBeanMapper membershipsEntityBeanMapper;

	public Memberships findById( Integer userId, Integer groupId  )
	{
        MembershipsEntityKey key = new MembershipsEntityKey(userId, groupId);
        MembershipsEntity entity = membershipsJpaRepository.findOne(key);
        return membershipsEntityBeanMapper.mapEntityToBean(entity);
	}

	public List<Memberships> findAll()
	{
		List<Memberships> list = new LinkedList<Memberships>();
		Iterator<MembershipsEntity> iter = membershipsJpaRepository.findAll().iterator();
		while(iter.hasNext())
		{
			list.add(membershipsEntityBeanMapper.mapEntityToBean(iter.next()));
		}
		return list;
	}

	public Memberships save(Memberships bean)
	{
		return persist(bean);
	}

	public Memberships update(Memberships bean)
	{
		return persist(bean);
	}

	public Memberships create(Memberships bean)
	{
		return persist(bean);
	}

	public void delete( Integer userId, Integer groupId )
	{
        MembershipsEntityKey key = new MembershipsEntityKey(userId, groupId);
        membershipsJpaRepository.delete(key);
	}

	private Memberships persist(Memberships bean)
	{
		MembershipsEntity entity = membershipsEntityBeanMapper.mapBeanToEntity(bean);
		MembershipsEntity persistedEntity = membershipsJpaRepository.save(entity);
		return membershipsEntityBeanMapper.mapEntityToBean(persistedEntity);
	}
}