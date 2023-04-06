interface Bank {
    void bankName();
}

interface Account {
    void accountType();
}

class Bank1 implements Bank {
    @Override
    public void bankName() {
        System.out.println("Bank-1 Ltd.");
    }
}

class Bank2 implements Bank{
    @Override
    public void bankName() {
        System.out.println("Bank-2. Ltd.");
    }
}

class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}

class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}

abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Account getAccount(String accountType);
}

class BankFactory extends AbstractFactory {
    final String BANK1 = "BANK-1";
    final String BANK2   = "BANK-2";

    @Override
    Bank getBank(String bankName) {
        if(BANK1.equalsIgnoreCase(bankName)){
            return new Bank1();
        }
        else if(BANK2.equalsIgnoreCase(bankName)){
            return new Bank2();
        }
        return null;
    }
    @Override
    Account getAccount(String accountType) {
        return null;
    }
}

class AccountFactory extends AbstractFactory {
    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    @Override
    Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        } else if (SAVING_ACCOUNT.equals(accountType)) {
            return new SavingAccount();
        }
        return null;
    }
}
class FactoryProducer {
    final static String BANK  = "BANK";
    final static String ACCOUNT = "ACCOUNT";
    public static AbstractFactory getFactory(String factory){
        if(BANK.equalsIgnoreCase(factory)){
            return new BankFactory();
        }
        else if(ACCOUNT.equalsIgnoreCase(factory)){
            return new AccountFactory();
        }
        return null;
    }
}

class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType(); //SAVING_ACCOUNT
        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType(); //CURRENT_ACCOUNT
    }
}