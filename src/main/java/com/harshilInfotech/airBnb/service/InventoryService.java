package com.harshilInfotech.airBnb.service;

import com.harshilInfotech.airBnb.entity.Room;

public interface InventoryService {

    void  initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
