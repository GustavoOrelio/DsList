package com.gustavoorelio.dslist.repositories;

import com.gustavoorelio.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
