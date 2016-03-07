package io.vntr.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import io.vntr.jpa.bean.VentsEntity;

public interface VentsJpaRepository extends PagingAndSortingRepository<VentsEntity, Integer>
{
}