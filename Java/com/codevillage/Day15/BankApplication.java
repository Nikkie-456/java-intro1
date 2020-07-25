package com.codevillage.Day15;

import com.codevillage.Day9.MyFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner bankApp = new Scanner(System.in);

        int a = 0;
        Integer appPin = 0;
        int a1 = 0;
        int noOfAccs = 0;
        double withAmt = 0;
        double accBal = 200000.00;
        double currBal = 0.00;
        double ledgBal = 0.00;
        double depAmnt = 0.00;

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer = new Customer("Nicolus",45678904,"Nairobi","0785328654",null);
        customers.add(customer);

        System.out.println("Enter Pin No");
        a = bankApp.nextInt();


            if (a != 1977) {
                System.out.println("Wrong Pin No Entered");
            }


        System.out.println("---My Bank Home Screen---");
        System.out.println("1. Check Balance.");
        System.out.println("2. Withdraw Cash.");
        System.out.println("3. Cash Transfer.");
        System.out.println("4. Exit.");


        System.out.println("Enter Selection");
        a1 = bankApp.nextInt();

        String name1="";
        int idNo1=0;
        String address1= "";
        String phoneNo1= "";

        switch (a1) {
            case 0:
                break;
            case 1:
                System.out.println("----Account Balance Details-----");
                if (customers.size() > 0) {
                    for (Customer customer1 : customers
                    ) {
                        System.out.println("--Client Details---");
                        System.out.println("Customer Name :" + customer.getName());
                        System.out.println("Customer Id No :" + customer.getIdNo());
                        System.out.println("Customer Address :" + customer.getAddress());
                        System.out.println("Customer Phone No :" + customer.getPhoneNo());
                        System.out.println("Ledger Balance :" + accBal);
                    }
                }
                    break;
                    case 2:
                        String narration;

                        ArrayList<Withdrawal> withdraw = new ArrayList<>();


                        System.out.println(" Enter Withdrawal Description");
                        narration = bankApp.next();

                        System.out.println(" Enter Withdrawal Amount");
                        withAmt = bankApp.nextDouble();

                        Withdrawal withdraw1 = new Withdrawal(narration,withAmt);
                        withdraw.add(withdraw1);

                        if (customers.size() > 0) {
                            for (Customer customer1 : customers
                            ) {
                                System.out.println("--Customer Details---");
                                System.out.println("Customer Name :" + customer.getName());
                                System.out.println("Customer Id No :" + customer.getIdNo());
                                System.out.println("Customer Address :" + customer.getAddress());
                                System.out.println("Customer Phone No :" + customer.getPhoneNo());
                                System.out.println("---Withdrawal Amount---");
                                if (withdraw.size() > 0) {
                                    for (Withdrawal withDraw : withdraw
                                    ) {
                                        System.out.println("Withdrawal Narration:" + withDraw.getWithDrawName());
                                        System.out.println("Withdrawn Amount:" + withDraw.getWithDrawAmt());
                                        System.out.println("Ledger Balance:\t" +MyFunctions.getSub(accBal,withDraw.getWithDrawAmt()) );
                                    }
                                }
                            }
                        }
                            break;
                            case 3:

                                System.out.println("Enter No Of Accounts");
                                noOfAccs = bankApp.nextInt();

                                String accName1 = "";
                                String accType1 = "";
                                int accNumber1 = 0;
                                double accBalance1 = 0;

                                ArrayList<Account> accounts = new ArrayList<>();
                                ArrayList<Transaction> transactions = new ArrayList<>();

                                if (noOfAccs > 0) {
                                    accounts = new ArrayList<>();
                                    for (int n = 0; n < noOfAccs; n++) {
                                        System.out.println(" Enter Account Name");
                                        accName1 = bankApp.next();

                                        System.out.println(" Enter Account Type");
                                        accType1 = bankApp.next();

                                        System.out.println(" Enter Account No");
                                        accNumber1 = bankApp.nextInt();

                                        System.out.println(" Enter Deposited Amount");
                                        accBalance1 = bankApp.nextDouble();
                                        depAmnt = accBalance1;

                                        System.out.println("Enter No Of Transfers");
                                        int noOfTrf = bankApp.nextInt();

                                        String trfType = "";
                                        int mobilNo = 0;
                                        double trfAmt = 0;


                                        if (noOfTrf > 0) {
                                            accounts = new ArrayList<>();
                                            for (int n1 = 0; n1 < noOfAccs; n1++) {
                                                System.out.println(" Enter Transfer Type");
                                                trfType = bankApp.next();

                                                System.out.println(" Enter Receipent Mobile No");
                                                mobilNo = bankApp.nextInt();

                                                System.out.println(" Enter Amount");
                                                trfAmt = bankApp.nextDouble();
                                            }
                                            transactions.add(new Transaction(trfType, mobilNo, trfAmt));

                                        }
                                        accounts.add(new Account(accName1, accNumber1, accType1, accBalance1, transactions));
                                    }


                                    if (customers.size() > 0) {
                                        for (Customer customer1 : customers
                                        ) {
                                            System.out.println("--Client Details---");
                                            System.out.println("Customer Name :" + customer.getName());
                                            System.out.println("Customer Id No :" + customer.getIdNo());
                                            System.out.println("Customer Address :" + customer.getAddress());
                                            System.out.println("Customer Phone No :" + customer.getPhoneNo());
                                            System.out.println("--Account Details---");
                                            if (customer.getAccounts().size() > 0) {
                                                for (Account account : customer.getAccounts()
                                                ) {
                                                    System.out.println("Account Name :" + account.getAccName());
                                                    System.out.println("Account Type :" + account.getAccType());
                                                    System.out.println("Account No:" + account.getAccNumber());
                                                    System.out.println("Ledger Balance:" + MyFunctions.getSum(account.getAccBalance(), accBal));
                                                }
                                            }

                                            System.out.println("---Transaction Details---");
                                            if (transactions.size() > 0) {
                                                for (Transaction transfer : transactions
                                                ) {
                                                    System.out.println("Transaction Type :" + transfer.getIdentity());
                                                    System.out.println("Receipient Mobile No :" + transfer.getMobileNo());
                                                    System.out.println("Amount Transfered:" + transfer.getAmt());
                                                    System.out.println("Ksh:" + transfer.getAmt() + "\t has been transfered to mobile no" + transfer.getMobileNo());
                                                }
                                            }
                                        }
                                    }
                                }
                                        break;
                                        case 4:
                                            return;
                                    }
                                }

        }




