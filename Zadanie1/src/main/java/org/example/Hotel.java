package org.example;

public class Hotel {
    private final MyMap<Room, Integer> prices;

    public Hotel() {
        prices = new MyMap<>();
        int floors = 10;
        int roomsAtFloor = 9;
        for(int i = 0; i < floors; i++) {
            for(int j = 1; j <= roomsAtFloor; j++) {
                int capacity;
                int price;
                if(j % 2 == 0){
                    capacity = 2;
                    price = 200;
                }
                else if(j % 3 == 0){
                     capacity = 3;
                     price = 300;
                }
                else{
                    capacity = 4;
                    price = 400;
                }
                int number = i * 100 + j;
                Room room = new Room(number, capacity);
                prices.put(room, price);
            }
        }
    }

    MyMap<Room, Integer> getPrices() {
        return prices;
    }


}
