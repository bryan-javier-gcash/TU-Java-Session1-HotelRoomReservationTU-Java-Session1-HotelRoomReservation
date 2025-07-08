package org.springtrack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        Scanner inputReader = new Scanner(System.in);
        int choice = 0;
        int roomNumber = 0;

        while(choice != 4) {
            System.out.println("Welcome to the Hotel Reservation System");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = inputReader.nextInt();

            //add new line
            System.out.println();

            switch (choice) {
                case 1:
                    hotelReservation.viewAvailableRooms();
                    //add new line
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter room number to book: ");
                    roomNumber = inputReader.nextInt();

                    hotelReservation.bookHotelRoom(roomNumber);
                    //add new line
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter room number to cancel: ");
                    roomNumber = inputReader.nextInt();

                    hotelReservation.cancelBookedRoom(roomNumber);
                    //add new line
                    System.out.println();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Wrong input, try again!");
                    //add new line
                    System.out.println();
                    break;
            }
        }

        System.out.println("Thank You!");
    }
}