package com.harshilInfotech.airBnb.service;

import com.harshilInfotech.airBnb.dto.HotelDto;
import com.harshilInfotech.airBnb.entity.Hotel;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);
}
