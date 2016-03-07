/* Created on 6 Mar 2016 at 18:48:54 */
package io.vntr.service.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.vntr.service.VentsService;
import io.vntr.bean.Vents;
import io.vntr.jpa.VentsJpaRepository;
import io.vntr.jpa.bean.VentsEntity;
import io.vntr.mapper.VentsEntityBeanMapper;

public class VentsServiceImpl implements VentsService
{
	@Autowired
	private VentsJpaRepository ventsJpaRepository; 

    @Autowired
    private VentsEntityBeanMapper ventsEntityBeanMapper;

	public Vents findById( Integer id  )
	{
        VentsEntity entity = ventsJpaRepository.findOne(id);
        return ventsEntityBeanMapper.mapEntityToBean(entity);
	}

	public List<Vents> findAll()
	{
		List<Vents> list = new LinkedList<Vents>();
		Iterator<VentsEntity> iter = ventsJpaRepository.findAll().iterator();
		while(iter.hasNext())
		{
			list.add(ventsEntityBeanMapper.mapEntityToBean(iter.next()));
		}
		return list;
	}

	public Vents save(Vents bean)
	{
		return persist(bean);
	}

	public Vents update(Vents bean)
	{
		return persist(bean);
	}

	public Vents create(Vents bean)
	{
		return persist(bean);
	}

	public void delete( Integer id )
	{
        ventsJpaRepository.delete(id);
	}

	private Vents persist(Vents bean)
	{
		VentsEntity entity = ventsEntityBeanMapper.mapBeanToEntity(bean);
		VentsEntity persistedEntity = ventsJpaRepository.save(entity);
		return ventsEntityBeanMapper.mapEntityToBean(persistedEntity);
	}
}