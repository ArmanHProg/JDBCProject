package org.airport_management_system;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompanyService {
    private static final String user = "postgres";
    private static final String pass = "sql2003";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";

    Connection con;
    Statement st;
    PreparedStatement pst;

    public Company getById(long id) {
        Company company = new Company();

        try {
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM companies WHERE id=" + id);
            while (rs.next()) {
                company.setCompanyId(rs.getInt("id"));
                company.setName(rs.getString("name"));
                company.setFoundDate(rs.getDate("found_date"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return company;
    }


    public Set<Company> getAll() throws SQLException {
        Set<Company> companySet = new HashSet<>();

        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM companies ");
        while (rs.next()) {
            companySet.add(new Company(rs.getInt("id"), rs.getString("name"),
                    rs.getDate("found_date")));
        }

        st.close();
        con.close();
        return companySet;
    }


    public void save(Company company) throws SQLException {
        java.sql.Date sqlDate = new java.sql.Date(company.getFoundDate().getTime());
        try {
            con = DriverManager.getConnection(url, user, pass);
            pst = con.prepareStatement("insert into companies(name,found_date)values (?,?)");
            pst.setString(1, company.getName());
            pst.setDate(2, sqlDate);
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            pst.close();
            con.close();
        }

    }

    public void update(Company company, int companyId) throws SQLException {

        java.sql.Date sqlDate = new java.sql.Date(company.getFoundDate().getTime());
        try {
            con = DriverManager.getConnection(url, user, pass);
            pst = con.prepareStatement("UPDATE companies SET  name=?,found_date=? WHERE id=?");
            pst.setString(1, company.getName());
            pst.setDate(2, sqlDate);
            pst.setInt(3, companyId);
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            pst.close();
            con.close();
        }
    }

    public void delete(int companyId) throws SQLException {

        try {
            con = DriverManager.getConnection(url, user, pass);
            pst = con.prepareStatement("SELECT COUNT(company_id) FROM trip WHERE company_id=?");
            pst.setInt(1, companyId);
            ResultSet rs = pst.executeQuery();
            rs.next();
            int count = rs.getInt("count");
            if (count > 0) {
                System.out.println("First remove the row from the trip table");
            } else {
                pst = con.prepareStatement("DELETE FROM companies WHERE id=?");
                pst.setInt(1, companyId);
                int row = pst.executeUpdate();
                if (row > 0) {
                    System.out.println("Company deleted");
                } else {
                    System.out.println("Company does not exist");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            pst.close();
            con.close();
        }
    }


    public List<Company> get(int offset, int perPage, String sort) throws SQLException {
        List<Company> company = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url, user, pass);
            pst = con.prepareStatement("SELECT * FROM companies ORDER BY " + sort + " LIMIT ? OFFSET ?");
            pst.setInt(1, perPage);
            pst.setInt(2, offset);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                company.add(new Company(rs.getInt("id"), rs.getString("name"),
                        rs.getDate("found_date")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            pst.close();
            con.close();
        }
        return company;
    }


}
