package Model;

import Model.Accounts.PersonalAccount;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static Map<Integer, PersonalAccount> allAccounts;

    Application() {
        allAccounts = new HashMap<>();
    }
}
