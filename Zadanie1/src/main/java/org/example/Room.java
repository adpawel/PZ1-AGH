package org.example;

import lombok.Data;

@Data
public class Room {
    private int number;
    private int capacity;

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }
}
