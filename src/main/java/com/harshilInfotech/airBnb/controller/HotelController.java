package com.harshilInfotech.airBnb.controller;

import com.harshilInfotech.airBnb.dto.HotelDto;
import com.harshilInfotech.airBnb.entity.Hotel;
import com.harshilInfotech.airBnb.service.HotelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/hotels")
public class HotelController {

    private final HotelService hotelService;

    @PostMapping
    public ResponseEntity<HotelDto> createNewHotel(@RequestBody HotelDto hotelDto) {
        log.info("Attempting to Create a new Hotel with name: {}", hotelDto.getName());

        HotelDto hotel = hotelService.createNewHotel(hotelDto);

        return new ResponseEntity<>(hotel, HttpStatus.CREATED);

    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelDto> getHotelById(@PathVariable Long hotelId) {

        HotelDto hotel = hotelService.getHotelById(hotelId);

        return new ResponseEntity<>(hotel, HttpStatus.OK);

    }

    @PutMapping("/{hotelId}")
    public ResponseEntity<HotelDto> updateHotelById(@PathVariable Long hotelId, @RequestBody HotelDto hotelDto) {

        HotelDto hotel = hotelService.updateHotelById(hotelId, hotelDto);

        return new ResponseEntity<>(hotel, HttpStatus.OK);

    }

    @DeleteMapping("/{hotelId}")
    public ResponseEntity<Void> deleteHotelById(@PathVariable Long hotelId) {

        Boolean hotel = hotelService.deleteHotelById(hotelId);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
