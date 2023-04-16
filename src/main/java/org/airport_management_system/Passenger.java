package org.airport_management_system;

public class Passenger {

    private int passenger_id;
    private String country;
    private String city;
    private String name;
    private String phone;
    private int address_id;

    public Passenger(int passenger_id, String name, String phone, int address_id, String city, String country) {
        this.passenger_id = passenger_id;
        this.name = name;
        this.phone = phone;
        this.address_id = address_id;
        this.city = city;
        this.country =country;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger_id=" + passenger_id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address_id=" + address_id +
                '}';
    }
}
