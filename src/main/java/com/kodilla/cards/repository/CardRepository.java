package com.kodilla.cards.repository;

import com.kodilla.cards.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

    @Override
    <S extends Card> S save(S Card);

    List<Card> findByCustomerId(Long customerId);
}
