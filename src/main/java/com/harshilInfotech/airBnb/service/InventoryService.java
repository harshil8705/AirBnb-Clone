package com.harshilInfotech.airBnb.service;

import com.harshilInfotech.airBnb.dto.HotelDto;
import com.harshilInfotech.airBnb.dto.HotelSearchRequest;
import com.harshilInfotech.airBnb.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void  initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

}