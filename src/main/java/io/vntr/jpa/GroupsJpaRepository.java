package io.vntr.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import io.vntr.jpa.bean.GroupsEntity;

public interface GroupsJpaRepository extends PagingAndSortingRepository<GroupsEntity, Integer>
{
}