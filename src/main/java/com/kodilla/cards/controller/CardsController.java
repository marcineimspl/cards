package com.kodilla.cards.controller;

import com.kodilla.cards.domain.GetCardsResponse;
import com.kodilla.cards.mapper.CardMapper;
import com.kodilla.cards.service.interfaces.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/v1/cards")
@RequiredArgsConstructor
public class CardsController {

    private final CardMapper cardMapper;
    private final CardService cardService;

    @GetMapping
    public GetCardsResponse getCardsByCustomerId(@RequestParam Long customerId)  {
        return new GetCardsResponse(
                cardMapper.mapToCardDtoList(cardService.findCustomerCards(customerId)));
    }

}
