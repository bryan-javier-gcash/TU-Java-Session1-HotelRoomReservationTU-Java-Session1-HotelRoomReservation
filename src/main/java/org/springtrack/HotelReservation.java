package org.springtrack;

import java.util.ArrayList;

public class HotelReservation {
    private ArrayList<Integer> availableRooms;
    private ArrayList<Boolean> roomsStatus;

    public HotelReservation(){
        this.availableRooms = new ArrayList<>();
        this.roomsStatus = new ArrayList<>();

        // Create 10 room numbers
        int startingRoomNumber = 101;
        int numberOfRooms = 10;

        for (int i = 0; i < numberOfRooms; i++) {
            availableRooms.add(startingRoomNumber);
            startingRoomNumber++;
            roomsStatus.add(true);
        }
    }

    public void viewAvailableRooms() {
        System.out.println("Available Rooms: ");
        for (int room: availableRooms){
            if (roomsStatus.get(availableRooms.indexOf(room))){
                System.out.print(room + " ");
            }
        }

        //add new line
        System.out.println();
    }

    public void bookHotelRoom(int roomNumber) {
        int index = availableRooms.indexOf(roomNumber);
        roomsStatus.set(index, false);

        System.out.println("Room " + roomNumber + " booked successfully.");
    }

    public void cancelBookedRoom(int roomNumber) {
        int index = availableRooms.indexOf(roomNumber);
        roomsStatus.set(index, true);

        System.out.println("Room " + roomNumber + " reservation cancelled.");
    }
}
