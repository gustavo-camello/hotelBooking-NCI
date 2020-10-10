/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelBookings;

import java.io.Serializable;

/**
 *
 * @author DouglasMasotti, GustavoCamello, DanielPinton
 */
public class hotelBookings implements Serializable {
    //declaring variables
    private String firstName;
    private String lastName;
    private int nightsQntt;
    private int singleBedsQntt;
    private int doubleBedsQntt;
    private int bathQntt;
    private double finalPrice;
    
    //constructor
    public hotelBookings(){
        firstName = new String();
        lastName = new String();
        nightsQntt = 0;
        singleBedsQntt = 0;
        doubleBedsQntt = 0;
        bathQntt = 0;
        finalPrice = 0.0;
    }

    
    // creating all setters and getters for variables that will be used in hotelBookingGUI.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNightsQntt() {
        return nightsQntt;
    }

    public void setNightsQntt(int nightsQntt) {
        this.nightsQntt = nightsQntt;
    }

    public int getSingleBedsQntt() {
        return singleBedsQntt;
    }

    public void setSingleBedsQntt(int singleBedsQntt) {
        this.singleBedsQntt = singleBedsQntt;
    }

    public int getDoubleBedsQntt() {
        return doubleBedsQntt;
    }

    public void setDoubleBedsQntt(int doubleBedsQntt) {
        this.doubleBedsQntt = doubleBedsQntt;
    }

    public int getBathQntt() {
        return bathQntt;
    }

    public void setBathQntt(int bathQntt) {
        this.bathQntt = bathQntt;
    }
    
    public double getFinalPrice() {
        return finalPrice;
    }

    public double setFinalPrice(double finalPrice) {
        return finalPrice;
    }
   
}
