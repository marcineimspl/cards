package com.kodilla.cards.domain;

import com.kodilla.cards.dto.CardDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCardsResponse {

    private List<CardDto> cardDtoList;
}
