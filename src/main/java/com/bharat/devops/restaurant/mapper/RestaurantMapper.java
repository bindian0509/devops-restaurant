package com.bharat.devops.restaurant.mapper;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Thursday, 11 January 2024
 */

import com.bharat.devops.restaurant.dto.RestaurantDTO;
import com.bharat.devops.restaurant.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
