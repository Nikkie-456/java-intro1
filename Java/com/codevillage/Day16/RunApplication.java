package com.codevillage.Day16;

import com.codevillage.Day15.Withdrawal;
import com.codevillage.Day9.MyFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args){
        Scanner bank = new Scanner(System.in);
        ArrayList<Currency> currency=new ArrayList<>();
        double withAmt = 0;
        double accBal = 200000.00;
        double currBal = 0.00;
        double ledgBal = 0.00;
        double depAmnt = 0.00;

        System.out.println("********************");
        HashMap<String,Customer> customers=new HashMap<>();
        customers.put("0789988655",new Customer("Jack Bauer","Ngong"));
        customers.put("0789988654",new Customer("John Blue","Langata"));
        customers.put("0789988653",new Customer("Ken M","Utawala"));

        System.out.println("Enter Phone Number");
        String regNo= bank.next();
        Customer stud = customers.get(regNo);

        if (stud != null) {
            System.out.println("Select A Transaction");
            System.out.println("********************");
            for (Transaction acc: Transaction.values()
            ) {
                System.out.println(acc.toString());
            }
        } else {
            System.out.println("Invalid Phone No");
        }


        System.out.println("Enter Transaction");
        String inp=bank.next();

        if (inp.equalsIgnoreCase(String.valueOf(Transaction.CheckBalance))){
            System.out.println("*****Current Account Balance*****");
            System.out.println("Customer Name:\t"+stud.getName());
            System.out.println("Customer Address:\t"+stud.getAddress());
            System.out.println("Curr. Ledger Balance:\t "+accBal);
        }

        if (inp.equalsIgnoreCase(String.valueOf(Transaction.CashWithdrawal))){



            System.out.println("Enter Currency Type");
            String currType=bank.next();

            System.out.println("Enter Currency Name");
            String currDesc=bank.next();

            System.out.println("Enter Withdrawal Amt");
            withAmt=bank.nextDouble();

            Currency currency1 = new Currency(currType,currDesc);
            currency.add(currency1);

            System.out.println("*****Current Account Balance*****");
            System.out.println("Customer Name:\t"+stud.getName());
            System.out.println("Customer Address:\t"+stud.getAddress());
            System.out.println("Opening Balance:\t"+accBal);
            System.out.println("Withdrawn Amt:\t"+currency1.getCurrNotation()+"\t:"+withAmt);
            System.out.println("Curr. Ledger Balance:\t "+ MyFunctions.getSub(accBal,withAmt));
        }

        if(inp.equalsIgnoreCase(String.valueOf(Transaction.CashDeposit))){
            System.out.println("Enter Currency Type");
            String currType=bank.next();

            System.out.println("Enter Currency Name");
            String currDesc=bank.next();

            System.out.println("Enter Amount For Deposit");
            depAmnt=bank.nextDouble();

            Currency currency1 = new Currency(currType,currDesc);
            currency.add(currency1);

            System.out.println("*****Current Account Balance*****");
            System.out.println("Customer Name:\t"+stud.getName());
            System.out.println("Customer Address:\t"+stud.getAddress());
            System.out.println("Opening Balance:\t"+accBal);
            System.out.println("Cash Deposit Amt:\t"+currency1.getCurrNotation()+"\t:"+depAmnt);
            System.out.println("Curr. Ledger Balance:\t "+ MyFunctions.getSum(accBal,depAmnt));
        }


    }//method
}//main Class
