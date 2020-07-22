package com.codevillage.Day15;

import com.codevillage.Day9.MyFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner bankApp = new Scanner(System.in);

        Integer a = 0;
        Integer appPin = 0;
        int a1 = 0;
        int noOfAccs = 0;
        double withAmt = 0;
        double accBal = 200000.00;
        double currBal = 0.00;
        double ledgBal = 0.00;
        double depAmnt = 0.00;

        System.out.println("---My Bank Home Screen---");
        System.out.println("1. Check Balance.");
        System.out.println("2. Withdraw Cash.");

        System.out.println("Enter Pin No");
        a = bankApp.nextInt();

        if (a != null) {
            if (appPin != 1977) {
                System.out.println("Wrong Pin No Entered");
            }
        } else {
            System.out.println("Pin not entered");
        }


        System.out.println("-----Bank App Guide-----");
        System.out.println("Enter 1 to Check Balance");
        a1 = bankApp.nextInt();

        String name1="";
        int idNo1=0;
        String address1= "";
        String phoneNo1= "";

        ArrayList<Customer> customers = new ArrayList<>();
        if (a1 == 1) {
            for (int i = 0; i < a1; i++) {

                System.out.println(" Enter Customer Name");
                name1 = bankApp.next();

                System.out.println(" Enter Customer ID Number");
                idNo1 = bankApp.nextInt();

                System.out.println(" Enter Customer Address");
                address1 = bankApp.next();

                System.out.println(" Enter Customer Phone No");
                phoneNo1 = bankApp.next();
            }

            System.out.println("Enter No Of Accounts");
            noOfAccs = bankApp.nextInt();
            String accName1 = "";
            String accType1 = "";
            int accNumber1 = 0;
            double accBalance1 = 0;

            ArrayList<Account> accounts = new ArrayList<>();
            if (noOfAccs > 0) {
                accounts = new ArrayList<>();
                for (int n = 0; n < noOfAccs; n++) {
                    System.out.println(" Enter Account Name");
                    accName1 = bankApp.next();

                    System.out.println(" Enter Account Type");
                    accType1 = bankApp.next();

                    System.out.println(" Enter Account No");
                    accNumber1 = bankApp.nextInt();

                    System.out.println(" Enter Opening Balance");
                    accBalance1 = bankApp.nextDouble();
                }
                accounts.add(new Account(accName1, accNumber1, accType1, accBalance1));
            }
            customers.add(new Customer(name1, idNo1, address1, phoneNo1, accounts));
        }
        if (customers.size() > 0) {
            for (Customer customer : customers
            ) {
                System.out.println("Customer Name :" + customer.getName());
                System.out.println("Customer ID NO :" + customer.getIdNo());
                System.out.println("Customer Address :" + customer.getAddress());
                System.out.println("Customer Phone No :" + customer.getPhoneNo());
                System.out.println("--Account Details---");
                if(customer.getAccounts().size()>0){
                    for (Account account: customer.getAccounts()
                    ) {
                        System.out.println("Account Name :" +account.getAccName());
                        System.out.println("Account Type :" +account.getAccType());
                        System.out.println("Account No:" +account.getAccNumber());
                        System.out.println("Ledger Balance:" + MyFunctions.getSum(account.getAccBalance(),accBal));
                    }
                }
            }

        }


    }
}
