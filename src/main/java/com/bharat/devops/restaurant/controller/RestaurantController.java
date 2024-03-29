package com.bharat.devops.restaurant.controller;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Thursday, 11 January 2024
 */

import com.bharat.devops.restaurant.dto.RestaurantDTO;
import com.bharat.devops.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/restaurant")
@CrossOrigin
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants() {
        List<RestaurantDTO> allRestaurants = restaurantService.findAllRestaurants();
        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        RestaurantDTO restaurantAdded = restaurantService.addRestaurantInDB(restaurantDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDTO> findRestaurantById(@PathVariable Integer id) {
        ResponseEntity<RestaurantDTO> restaurantDTOResponseEntity = restaurantService.fetchRestaurantById(id);
        if (Objects.isNull(restaurantDTOResponseEntity)) {
            throw new RuntimeException();
        }
        return restaurantDTOResponseEntity;
    }
}