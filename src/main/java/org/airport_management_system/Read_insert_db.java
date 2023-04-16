package org.airport_management_system;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;

public class Read_insert_db {

    private static final String user = "postgres";
    private static final String password = "sql2003";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";


    public static void main(String[] args) throws SQLException, IOException, ParseException {

//        Connection connection = DriverManager.getConnection(url, user, password);


//        String companyInputFile = "C:\\Users\\arman\\IdeaProjects\\gdbctest\\src\\main\\resources\\companies.txt";
//        BufferedReader companyReader = new BufferedReader(new FileReader(companyInputFile));
//        String line = companyReader.readLine();
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
//        companyReader.close();

//        String addressInputFile = "C:\\Users\\arman\\IdeaProjects\\gdbctest\\src\\main\\resources\\.txt";
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

//        String passengerInputFile = "C:\\Users\\arman\\IdeaProjects\\gdbctest\\src\\main\\resources\\passengers.txt";
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


//        String tripInputFile = "C:\\Users\\arman\\IdeaProjects\\gdbctest\\src\\main\\resources\\trip.txt";
//        BufferedReader tripReader = new BufferedReader(new FileReader(tripInputFile));
//
//
//        while ((line = tripReader.readLine()) != null) {
//
//            String[] values = line.split(",");
//            int tripNumber = Integer.parseInt(values[0]);
//            String companyId = values[1];
//            String townFrom = values[3];
//            String townTo = values[4];
//            String timeOut = values[5];
//            String timeIn = values[6];
//            String sql = "INSERT INTO Trip (trip_number, company_id, town_from, town_to, time_out, time_in) VALUES (?, ?, ?, ?, ?, ?)";
//
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1, tripNumber);
//            statement.setInt(2, Integer.parseInt(companyId.trim()));
//            statement.setString(3, townFrom);
//            statement.setString(4, townTo);
//
//            statement.setTimestamp(5, Timestamp.valueOf(timeOut));
//            statement.setTimestamp(6, Timestamp.valueOf(timeIn));
//            statement.executeUpdate();
//            statement.close();
//        }
//        tripReader.close();



//        String pass_tripInputFile = "C:\\Users\\arman\\IdeaProjects\\gdbctest\\src\\main\\resources\\pass_in_trip.txt";
//        BufferedReader pass_tripReader = new BufferedReader(new FileReader(pass_tripInputFile));
//
//
//        while ((line = pass_tripReader.readLine()) != null) {
//
//            String[] values = line.split(",");
//            int trip_id = Integer.parseInt(values[0]);
//            int passenger_id = Integer.parseInt(values[1]);
//            String date = values[2];
//            String place = values[3];
//
//            String sql = "INSERT INTO Pass_in_trip (trip_id, passenger_id, date, place) VALUES (?, ?, ?, ?)";
//
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1, trip_id);
//            statement.setInt(2, passenger_id);
//            statement.setTimestamp(3,Timestamp.valueOf(date));
//            statement.setString(4, place);
//            statement.executeUpdate();
//            statement.close();
//        }
//        pass_tripReader.close();
//
//    }


    }
}
