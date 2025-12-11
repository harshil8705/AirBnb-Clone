package com.harshilInfotech.airBnb.repository;

import com.harshilInfotech.airBnb.entity.Inventory;
import com.harshilInfotech.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByRoom(Room room);

}