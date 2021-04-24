package com.kodilla.cards.config;

import com.kodilla.cards.repository.CardRepository;
import com.kodilla.cards.service.implementations.CardServiceImpl;
import com.kodilla.cards.service.interfaces.CardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    protected CardService cardService(CardRepository cardRepository) {
        return new CardServiceImpl(cardRepository);
    }


}
