package org.zerock.b01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.b01.domain.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

}
