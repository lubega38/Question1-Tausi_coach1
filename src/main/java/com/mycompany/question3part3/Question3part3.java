/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question3part3;

/**
 *
 * @author ST.EDWARDS
 */
public class Question3part3 {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance from Kabale to Kampala
        int speedKmPerHour = 250; // Speed of the train in Km/hr
        int timePerStopMinutes = 5; // Time per stop in minutes
        int refuelStop = 200; // Stops for refueling

        // Calculate total travel time in hours
        double travelTimeHours = (double) totalDistance / speedKmPerHour;

        // Calculate total stops for refueling
        int totalStops = totalDistance / refuelStop;
        double stopTimeHours = totalStops * (timePerStopMinutes / 60.0);

        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("Total time to travel back from Kabale to Kampala: " + totalTimeHours + " hours");
    }
}
