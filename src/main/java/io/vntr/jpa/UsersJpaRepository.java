package io.vntr.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import io.vntr.jpa.bean.UsersEntity;

public interface UsersJpaRepository extends PagingAndSortingRepository<UsersEntity, Integer>
{
}