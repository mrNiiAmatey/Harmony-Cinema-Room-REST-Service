package org.harmony.cinema_room_rest_service.controller;

import org.harmony.cinema_room_rest_service.model.Cinema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController {

    private final Cinema cinema = new Cinema(9,9);

    @GetMapping("/seats")
    public Cinema getSeats() {
        return cinema;
    }
}
