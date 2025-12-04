package com.harshilInfotech.airBnb.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Entity
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class HotelContactInfo {

    private String address;
    private String phoneNumber;
    private String email;
    private String location;

}
