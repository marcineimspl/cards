package com.kodilla.cards.service.implementations;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.repository.CardRepository;
import com.kodilla.cards.service.interfaces.CardService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public List<Card> findCustomerCards(Long customerId) {
        return cardRepository.findByCustomerId(customerId);
    }
}
