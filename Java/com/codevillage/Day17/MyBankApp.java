package com.codevillage.Day17;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class MyBankApp {
    public static void main(String[] agrgs) throws SQLException {
        Connection myConn = null;
        ResultSet rs1 = null;
        String sql = new String();
        Scanner dbDetails = new Scanner(System.in);


        String url = "jdbc:mysql://localhost:3306/mybankdetails";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            sql = "select * from mybankdetails.customer";
            rs1 = myStmt.executeQuery(sql);

            while (rs1.next()) {
                System.out.println(rs1.getString("full_name") + "\t" + rs1.getString("pin_no"));
            }


            System.out.println("Enter Name");
            String name = dbDetails.next();

            System.out.println("Enter ID Number");
            String idNumber = dbDetails.next();

            System.out.println("Enter gender");
            String gender = dbDetails.next();

            System.out.println("Enter Pin No");
            String pin_no = dbDetails.next();

            try {
                PreparedStatement ps = myConn.prepareStatement("insert into customer(id_number,full_name,gender,pin_no) values ('?','?','?','?')");
                ps.setString(1, idNumber);
                ps.setString(2, name);
                ps.setString(3, gender);
                ps.setString(4, pin_no);
                ps.executeUpdate();

                while (rs1.next()) {
                    System.out.println(rs1.getString("full_name") + "\t" + rs1.getString("pin_no"));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        e.printStackTrace();
    }finally {
            if (myConn != null || rs1 != null) {
                try {
                    myConn.close();
                    rs1.close();
                } catch (Exception ex) {

                }
            }
        }
    }
}

