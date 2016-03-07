package io.vntr.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import io.vntr.jpa.bean.MembershipsEntity;
import io.vntr.jpa.bean.MembershipsEntityKey;

public interface MembershipsJpaRepository extends PagingAndSortingRepository<MembershipsEntity, MembershipsEntityKey>
{
}