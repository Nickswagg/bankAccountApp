package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        // Checking checkacc1 = new Checking("Nicolas Tientcheu", "321456879", 1500);

        // Savings savacc1 = new Savings("Rich Lowe", "456657837", 25000);

        // savacc1.compound();

        // savacc1.showInfo();
        // System.out.println("***************");
        // checkacc1.showInfo();

        // savacc1.deposit(5000);
        // savacc1.withdraw(200);
        // savacc1.transfer("Belmont", 3000);

        // Read a CSV File then create new accounts base on that data
        String file = "C:\\Users\\admin\\Desktop\\WIN 2020\\JAVA\\Java OOP Projects\\bankaccountapp\\utilities\\original.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            // System.out.println(name + " " + sSN + " " + accountType + "$" + initDeposit);
            if (accountType.equals("Savings")) {
                // System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                // System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        //
        for (Account acc : accounts) {
            System.out.println("\n***************");
            acc.showInfo();
        }
    }

}