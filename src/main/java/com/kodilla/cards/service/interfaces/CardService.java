package com.kodilla.cards.service.interfaces;

import com.kodilla.cards.domain.Card;

import java.util.List;

public interface CardService {
    List<Card> findCustomerCards(final Long customerId);
}
