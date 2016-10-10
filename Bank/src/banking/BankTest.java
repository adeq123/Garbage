package banking;
import banking.*;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank(50);
        Account account = new Account("John",100);
        bank.createAccount(account);
        bank.displayAccounts();
    }
}