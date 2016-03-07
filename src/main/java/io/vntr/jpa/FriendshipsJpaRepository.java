package io.vntr.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import io.vntr.jpa.bean.FriendshipsEntity;
import io.vntr.jpa.bean.FriendshipsEntityKey;

public interface FriendshipsJpaRepository extends PagingAndSortingRepository<FriendshipsEntity, FriendshipsEntityKey>
{
}