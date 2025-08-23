package com.mendesmonique.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendesmonique.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
