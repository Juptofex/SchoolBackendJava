package be.vinci.cae.fiche1.controller;

import be.vinci.cae.fiche1.models.Restaurant;
import be.vinci.cae.fiche1.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/restaurants")
public class RestaurantsController {
    private final RestaurantService restaurantService;

    public RestaurantsController(RestaurantService  restaurantService) {
        this.restaurantService = restaurantService;
    }
    @GetMapping("/")
    public Iterable<Restaurant> restaurant(@RequestParam(required = false) String type) {
        if (type == null || type.isEmpty()) {
            return restaurantService.getAllRestaurant();
        }
        return restaurantService.getRestaurant(type);
    }
}
