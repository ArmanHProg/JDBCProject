package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    private static final String user = "postgres";
    private static final String password = "sql2003";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";


    public static void main(String[] args) throws SQLException, IOException, ParseException {

        Connection connection = DriverManager.getConnection(url, user, password);


        String companyInputFile = "C:\\Users\\arman\\OneDrive\\Рабочий стол\\homework_JDBC\\companies.txt";
        BufferedReader companyReader = new BufferedReader(new FileReader(companyInputFile));
        String line = companyReader.readLine();
//        while ((line = companyReader.readLine()) != null) {
//            String[] values = line.split(",");
//            String name = values[0];
//            String foundingDate = values[1];
//            String[] dt = foundingDate.split("/");
//            foundingDate = dt[2] + "-" + dt[0] + "-" + dt[1];
//            String sql = "INSERT INTO Company (name, founding_date) VALUES (?, ?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, name);
//            statement.setDate(2, java.sql.Date.valueOf(foundingDate));
//            statement.executeUpdate();
//            statement.close();
//        }
        companyReader.close();

//        String addressInputFile = "C:\\Users\\arman\\OneDrive\\Рабочий стол\\homework_JDBC\\passengers.txt";
//        BufferedReader addressReader = new BufferedReader(new FileReader(addressInputFile));
//        line = addressReader.readLine();
//        while ((line = addressReader.readLine()) != null) {
//            String[] values = line.split(",");
//            String country = values[2];
//            String city = values[3];
//            String sql = "INSERT INTO Address (country, city) VALUES (?, ?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, country);
//            statement.setString(2, city);
//            statement.executeUpdate();
//            statement.close();
//        }
//        addressReader.close();

//        String passengerInputFile = "C:\\Users\\arman\\OneDrive\\Рабочий стол\\homework_JDBC\\passengers.txt";
//        BufferedReader passengerReader = new BufferedReader(new FileReader(passengerInputFile));
//        int counterForAddressId = 1;
//        while ((line = passengerReader.readLine()) != null) {
//            String[] values = line.split(",");
//            String name = values[0];
//            String phone = values[1];
//            int addressId = counterForAddressId++;
//            String sql = "INSERT INTO Passenger (name, phone, address_id) VALUES (?, ?, ?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, name);
//            statement.setString(2, phone);
//            statement.setInt(3, addressId);
//            statement.executeUpdate();
//            statement.close();
//        }
//        passengerReader.close();

        String tripInputFile = "C:\\Users\\arman\\OneDrive\\Рабочий стол\\homework_JDBC\\trip.txt";
        BufferedReader tripReader    = new BufferedReader(new FileReader(tripInputFile));


        while ((line = tripReader.readLine()) != null) {

            String[] values     = line.split(",");
            String   tripNumber = values[0];
            String   companyId  = values[1];
            String   townFrom   = values[3];
            String   townTo     = values[4];
            String   timeOut    = values[5];
            String   timeIn     = values[6];
            String   sql        = "INSERT INTO Trip (trip_number, company_id, town_from, town_to, time_out, time_in) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement statement  = connection.prepareStatement(sql);
            statement.setString(1, tripNumber);
            statement.setInt(2, Integer.parseInt(companyId.trim()));
            statement.setString(3, townFrom);
            statement.setString(4, townTo);

            statement.setTimestamp(5, Timestamp.valueOf(timeOut));
            statement.setTimestamp(6, Timestamp.valueOf(timeIn));
            statement.executeUpdate();
            statement.close();
        }
        tripReader.close();

    }
}