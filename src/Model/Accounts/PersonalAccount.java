package Model.Accounts;

import Model.Loans.PersonalLoan;

import java.util.ArrayList;
import java.util.Objects;

import static Model.Application.allAccounts;

public class PersonalAccount {

    private static int nextAccountId = 0;
    private int customerId;
    private String password;
    private String name;
    private Double balance;
    private String address;
    private String email;
    private ArrayList<PersonalLoan> loans;

    PersonalAccount(String name, Double initbalance, String address, String email, String password) {
        allAccounts.put(customerId, this);
        this.name = name;
        this.customerId = nextAccountId++;
        this.password = password;
        this.balance = initbalance;
        this.address = address;
        this.email = email;
    }

    public boolean authenticate(String pass) {
        return (Objects.equals(pass, this.password));
    }

    public boolean deposit(String pass, double amount) {
        if (authenticate(pass)) {
            this.balance = this.balance + amount;
            return true;
        }
        System.out.println("Wrong password!");
        return false;
    }

    public boolean deduct(String pass, double amount) {
        if (authenticate(pass)) {
            this.balance = this.balance - amount;
            return true;
        }
        System.out.println("Wrong password!");
        return false;
    }

//    public boolean loanBorrowed(String pass) {
//        if (Objects.equals(this.password, pass)) {
//            this.loancount++;
//            return true;
//        }
//        System.out.println("Wrong password!");
//        return false;
//    }

//    public boolean borrowLoan(Loan newloan, String pass) {
//        if (Objects.equals(this.password, pass)) {
//
//        }
//    }

    public boolean changeEmail(String pass, String newEmail) {
        if (authenticate(pass)) {
            this.email = newEmail;
            return true;
        }
        System.out.println("Wrong password!!");
        return false;
    }

    public boolean changeAdress(String pass, String newAdress) {
        if (authenticate(pass)) {
            this.address = newAdress;
            return true;
        }
        System.out.println("Wrong password!!");
        return false;
    }



}
