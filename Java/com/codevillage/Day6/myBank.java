package com.codevillage.Day6;

import java.util.Scanner;

public class myBank {

    public static void main(String[] args){
        int a =0;
        int b =0;
        int c =0;
        int pinNo =0;
        int withAmt =0;
        double accBal =2000.00;
        double currBal = 0.00;
        double ledgBal = 0.00;
        double depAmnt = 0.00;

        Scanner bankDetails = new Scanner(System.in);

        System.out.println("Enter 1 to check balance");
        a = bankDetails.nextInt();

        if (a==1){
            System.out.println("Enter Pin No");
            pinNo = bankDetails.nextInt();

            if (pinNo != 4444){
                System.out.println("Wrong Pin No");
            }

            System.out.println("Your Current Balance is Shs:" +accBal);

        } else
        System.out.println("Wrong Pin No");

        System.out.println("Enter 2 to withdraw");
        b = bankDetails.nextInt();

        if (b==2){
            System.out.println("Enter Amount For Withdrawal");
            withAmt = bankDetails.nextInt();

            currBal = accBal -withAmt;
            System.out.println("Your Available Balance is Shs:" +currBal);
            System.out.println("Please collect your cash");

        } else
            System.out.println("Amount Not entered");

        System.out.println("Enter 3 to deposit");
        c = bankDetails.nextInt();

        if (c==3){
            System.out.println("Please put in amount for deposit");
            depAmnt = bankDetails.nextInt();
            ledgBal = currBal + depAmnt;

            System.out.println("Your Ledger Balance is Shs:" +ledgBal);
            System.out.println("Amount Deposited Successfully");

    } else
            System.out.println("Amount Not entered");
    }
}


/*static int getBal(int bal){
         int bal1 =0;

         bal1 =20000;

        return bal1;

    }*/
