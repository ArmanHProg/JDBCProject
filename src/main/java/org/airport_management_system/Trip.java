package org.airport_management_system;

import java.sql.Timestamp;

public class Trip {

    private  int trip_id;
    private  int company_id;
    private  String town_from;
    private  String town_to;
    private Timestamp timeOut;
    private Timestamp timeIn;

    public Trip(int trip_id, int company_id, String town_from, String town_to, Timestamp timeOut, Timestamp timeIn) {
        this.trip_id = trip_id;
        this.company_id = company_id;
        this.town_from = town_from;
        this.town_to = town_to;
        this.timeOut = timeOut;
        this.timeIn = timeIn;
    }

    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getTown_from() {
        return town_from;
    }

    public void setTown_from(String town_from) {
        this.town_from = town_from;
    }

    public String getTown_to() {
        return town_to;
    }

    public void setTown_to(String town_to) {
        this.town_to = town_to;
    }

    public Timestamp getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Timestamp timeOut) {
        this.timeOut = timeOut;
    }

    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "trip_id=" + trip_id +
                ", company_id=" + company_id +
                ", town_from='" + town_from + '\'' +
                ", town_to='" + town_to + '\'' +
                ", timeOut=" + timeOut +
                ", timeIn=" + timeIn +
                '}';
    }
}
