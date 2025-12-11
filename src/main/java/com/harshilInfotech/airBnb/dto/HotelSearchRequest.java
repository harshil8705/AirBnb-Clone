package com.harshilInfotech.airBnb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelSearchRequest {

    private String city;
    private LocalDate checkInDate;
    private LocalDate endDate;
    private Integer roomsCount;

    private Integer page=0;
    private Integer size = 10;

}