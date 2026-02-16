package org.harmony.cinema_room_rest_service.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private int rows;
    private int columns;
    private List<Seat> seats;

    public Cinema(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.seats = new ArrayList<>();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                seats.add(new Seat(r, c));
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
