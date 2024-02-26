package Model.Loans;

import Model.Accounts.PersonalAccount;

import java.util.Date;

import static Model.Application.allAccounts;

public class PersonalLoan {

    private Date issueDate;
    private double principal;
    private PersonalAccount customerName;
    private double interestRate;

    PersonalLoan(int customerID, Double amount, int Period, Date issueDate, String pass, int roi) {
        if (allAccounts.containsKey(customerID)) {
            if (allAccounts.get(customerID).authenticate(pass)) {
                // Make a loannnn
            }
            else {
                System.out.println("Your password is incorrect!");
            }
        } else {
            System.out.println("Please make an account!");
        }
    }
}
