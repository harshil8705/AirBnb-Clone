package com.harshilInfotech.airBnb.controller;

import com.harshilInfotech.airBnb.dto.HotelDto;
import com.harshilInfotech.airBnb.dto.HotelSearchRequest;
import com.harshilInfotech.airBnb.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotels")
public class HotelBrowseController {

    private final InventoryService inventoryService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelDto>> searchHotels(@RequestBody HotelSearchRequest request) {

        Page<HotelDto> page = inventoryService.searchHotels(request);
        return new ResponseEntity<>(page,HttpStatus.OK);
    }

}