package com.bharat.devops.restaurant.dto;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Thursday, 11 January 2024
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {

    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;

}
