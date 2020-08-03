package com.codevillage.Day17;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class BankApp {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        String sql = new String();
        Scanner dbDetails = new Scanner(System.in);
        Statement myStmt = null;
        String pattern = "";
        Date myDate=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String stringDate=formatter.format(myDate);


        //DB Connection and Menu Details
        String url = "jdbc:mysql://localhost:3306/mybankdetails";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            myConn = DriverManager.getConnection(url, user, password);
            myStmt = myConn.createStatement();
            sql = "select * from mybankdetails.mst_transaction";
            rs1 = myStmt.executeQuery(sql);
            System.out.println("******Bank Menu******");
            while (rs1.next()) {
                System.out.println(rs1.getString("tran_id") + "\t" + rs1.getString("tran_name"));
            }


        //Check tran type
        System.out.println("Select Option to Proceed");
        int option= dbDetails.nextInt();

        switch (option){
            case 0:
                break;
            case 1:

                System.out.println("******Select Accounts******");
                sql = "select * from mybankdetails.mst_account";
                rs2 = myStmt.executeQuery(sql);

                System.out.println("******Accounts Available******");
                while (rs2.next()) {
                    System.out.println(rs2.getString("Account_code") + "\t" + rs2.getString("Account_name"));
                }

                sql = "select concat(c.FirstName,\" \",c.LastName) as customer_name,a.Account_name,b.Account_code,b.Tran_date,b.Tran_type,b.Tran_amount from mst_account a,dt_transaction b,mst_customer c where a.account_code = b.account_code and b.cust_id = c.cust_id";
                rs3 = myStmt.executeQuery(sql);

                System.out.println(" Enter Account Code");
                String accCode= dbDetails.next();

                System.out.println(" Enter Withdrawal Narration");
                String narr= dbDetails.next();
                String balType="Dr";

                System.out.println(" Enter Withdrawal Amount");
                double withAmt = dbDetails.nextDouble();


                PreparedStatement ps = myConn.prepareStatement("insert into dt_transaction(account_code,tran_date,tran_type,tran_amount,cust_id) values (?,?,?,?,?)");
                ps.setString(1,accCode);
                ps.setDate(2,new java.sql.Date(myDate.getTime()));
                ps.setString(3, balType);
                ps.setDouble(4, withAmt);
                ps.setInt(5,1);
                ps.executeUpdate();

                while (rs3.next()) {
                    System.out.println("----Customer Ledger-----");
                    System.out.println("Customer Account No:"+rs3.getString("Account_code") + "\t Transaction Date:" + rs3.getDate("Tran_date") +"\t Balance Type:"+ rs3.getString("Tran_type")+"\t Amount:"+rs3.getInt("Tran_amount"));
                }

          break;
            case 2:
                System.out.println("******Select Account******");
                sql = "select * from mybankdetails.mst_account";
                rs2 = myStmt.executeQuery(sql);

                System.out.println("******Accounts Available******");
                while (rs2.next()) {
                    System.out.println(rs2.getString("Account_code") + "\t" + rs2.getString("Account_name"));
                }

                System.out.println(" Enter Account Code");
                 accCode= dbDetails.next();

                System.out.println(" Enter Deposit Narration");
                narr= dbDetails.next();

                balType="Cr";

                System.out.println(" Enter Deposit Amount");
                double depAmt = dbDetails.nextDouble();


                PreparedStatement ps1 = myConn.prepareStatement("insert into dt_deposit(account_code,tran_date,tran_type,dep_name,dep_amount) values (?,?,?,?,?)");
                ps1.setString(1,accCode);
                ps1.setDate(2,new java.sql.Date(myDate.getTime()));
                ps1.setString(3, balType);
                ps1.setString(4, narr);
                ps1.setDouble(5,depAmt);
                ps1.executeUpdate();

                while (rs3.next()) {
                    System.out.println("----Customer Ledger-----");
                    System.out.println("Customer Name:\t"+rs1.getString("FirstName")+"\t"+rs1.getString("LastName"));
                    System.out.println("Customer Account No:"+rs3.getString("Account_code"));
                    System.out.println("Transaction Details:\t"+rs3.getString("dep_name"));
                    System.out.println("Transaction Date:\t" + rs3.getDate("Tran_date"));
                    System.out.println("Balance Type:\t"+ rs3.getString("Tran_type"));
                    System.out.println("Amount:\t "+rs3.getInt("Tran_amount"));
                }
                break;
            case 3:
                System.out.println(" Enter New Pin");
                int pinN0 = dbDetails.nextInt();

                System.out.println("Re-enter New Pin");
                int pinN01 = dbDetails.nextInt();

                if (pinN0 != pinN01)
                {
                    System.out.println("Mismatch in Pin!.");
                    break;
                }

                ps1 = myConn.prepareStatement("update mst_customer set pin_no =? where cust_id =?");
                ps1.setInt(1,pinN01);
                ps1.setInt(2,1);
                ps1.executeUpdate();

                System.out.println("Pin Updated Successfully");

                break;

            case 4:
                System.out.println("******Customer Accounts******");
                sql = "select * from mybankdetails.mst_account";
                rs2 = myStmt.executeQuery(sql);

                System.out.println("******Accounts Available******");
                while (rs2.next()) {
                    System.out.println(rs2.getString("Account_code") + "\t" + rs2.getString("Account_name"));
                }

                System.out.println("Enter From Account");
                String frmAcc = dbDetails.next();

                System.out.println("Enter Receipient");
                String toAcc = dbDetails.next();

                System.out.println("Enter Amount For Transfer");
                double trfAmt = dbDetails.nextDouble();

                balType="Dr";

                ps1 = myConn.prepareStatement("insert into dt_transfer(fro_account_code,to_account_code,transfer_date,tran_type,tran_amount,cust_id) values (?,?,?,?,?,?)");
                ps1.setString(1,frmAcc);
                ps1.setString(2,toAcc);
                ps1.setDate(3,new java.sql.Date(myDate.getTime()));
                ps1.setString(4, balType);
                ps1.setDouble(5, trfAmt);
                ps1.setInt(6,1);
                ps1.executeUpdate();

                break;

        }//end switch
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//---Fin 1
}
