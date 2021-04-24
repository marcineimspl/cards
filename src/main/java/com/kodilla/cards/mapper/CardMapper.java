package com.kodilla.cards.mapper;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.dto.CardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CardMapper {

    public Card mapToCard(CardDto cardDto) {
        return new Card(cardDto.getId(),
                cardDto.getName(),
                cardDto.getCreditValue(),
                cardDto.getCardNumber(),
                cardDto.getCustomerId());
    }
    
    public CardDto mapToCardDto(Card card) {
        return new CardDto(card.getId(),
                card.getName(),
                card.getCreditValue(),
                card.getCardNumber(),
                card.getCustomerId());
    }

    public List<Card> mapToCardList(List<CardDto> cardDtoList) {
        return cardDtoList.stream()
                .map(this::mapToCard)
                .collect(Collectors.toList());
    }


    public List<CardDto> mapToCardDtoList(List<Card> cardList) {
        return cardList.stream()
                .map(this::mapToCardDto)
                .collect(Collectors.toList());
    }

}
