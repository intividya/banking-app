package com.pmz.simplebankingapp.repository;

import com.pmz.simplebankingapp.domain.entity.Card;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

	List<Card> findCardsByUserId(long id);

	Card findCardById(long id);

}
